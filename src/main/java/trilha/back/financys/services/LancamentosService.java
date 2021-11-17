package trilha.back.financys.services;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.LancamentosRepository;
import java.util.*;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class LancamentosService {

    @Autowired
    private LancamentosRepository lancamentosRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    private ModelMapper mapper;

    private List<LancamentosDTO> lancamentosDTOList = new ArrayList<>();


    public LancamentosService(LancamentosRepository lancamentosRepository, ModelMapper modelMapper){
        this.lancamentosRepository = lancamentosRepository;
        this.mapper = mapper;
    }


    public boolean validadeCategoryByIdL(long idCategory){
        Optional<Category> category = categoryRepository.findById(idCategory);
        return category.isPresent();
    }

    public Lancamentos create (Lancamentos lancamentos){
       boolean categoriaExistente = validadeCategoryByIdL(lancamentos.getCategory().getId());
        if(categoriaExistente == false){
            System.out.println("================!CATEGORIA NÃO ENCONTRADA!===============");

        }
       return lancamentosRepository.save(lancamentos);
    }

    private LancamentosDTO mapToDTO(Lancamentos lancamentos){
        LancamentosDTO lancamentosDTO = mapper.map(lancamentos, LancamentosDTO.class);
        return lancamentosDTO;
    }

    private Lancamentos mapToEntity(LancamentosDTO lancamentosDTO){
        Lancamentos lancamentos = mapper.map(lancamentosDTO, Lancamentos.class);
        return lancamentos;
    }


    public List<LancamentosDTO> retornarListaDTO(){
        for(Lancamentos lancamentoCategoria : lancamentosRepository.findAll());
            lancamentoCategoria.

    }
        return mapToDTO(lancamentoCategoria);

}
