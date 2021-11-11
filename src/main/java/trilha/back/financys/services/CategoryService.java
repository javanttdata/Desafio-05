package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.repositories.CategoryRepository;

import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


     public Long idCategoryByName(String nameCategory ) {
        Category read = categoryRepository.findByName(nameCategory);
        return read.getId();
    }

    public void categoryByName (String categoryName){
        categoryRepository.findByName(categoryName);
    }

}
