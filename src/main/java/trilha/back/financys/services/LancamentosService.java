package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.LancamentosRepository;

import java.util.Optional;


@Service
public class LancamentosService {

    @Autowired
    private LancamentosRepository lancamentosRepository;

    @Autowired
    private CategoryRepository categoryRepository;


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

}




