package trilha.back.financys.services;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.exceptions.DivisaoZeroException;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.LancamentosRepository;
import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LancamentosService {

    private final LancamentosRepository lancamentosRepository;

    private final CategoryRepository categoryRepository;

    private final ModelMapper mapper;

    private List<LancamentosDTO> lancamentosDTOList = new ArrayList<>();

    public boolean validadeCategoryByIdL(long idCategory) {
        Optional<Category> category = categoryRepository.findById(idCategory);
        return category.isPresent();
    }

    public Lancamentos create(Lancamentos lancamentos) {
        boolean categoriaExistente = validadeCategoryByIdL(lancamentos.getCategory().getId());
        if (categoriaExistente == false) {
            System.out.println("================!CATEGORIA NÃO ENCONTRADA!===============");

        }
        return lancamentosRepository.save(lancamentos);
    }

    private LancamentosDTO mapToDto(Lancamentos lancamentos) {
        LancamentosDTO lancamentosDTO = mapper.map(lancamentos, LancamentosDTO.class);
        return lancamentosDTO;
    }

    private Lancamentos mapToEntity(LancamentosDTO lancamentosDTO) {
        Lancamentos lancamentos = mapper.map(lancamentosDTO, Lancamentos.class);
        return lancamentos;
    }

    public List<LancamentosDTO> retornarListaDto() {
        List<Lancamentos> listaLancamentos = lancamentosRepository.findAll();
        lancamentosRepository.getClass();
        return listaLancamentos.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x / y);
        } catch (ArithmeticException e) {
            throw new DivisaoZeroException("Na matemática, não se pode dividir por zero --- " + e);
        }
    }
}


