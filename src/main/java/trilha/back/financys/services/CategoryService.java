package trilha.back.financys.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.mappers.ModelMapper;
import trilha.back.financys.DTO.CategoryDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.repositories.CategoryRepository;
import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    private List<CategoryDTO> CategoryListDTO = new ArrayList<>();
    private ModelMapper modelMapper;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

     public Long idCategoryByName(String nameCategory ) {
        Category read = categoryRepository.findByName(nameCategory);
        return read.getId();
    }

    public void categoryByName (String categoryName){
        categoryRepository.findByName(categoryName);
    }

    public Category save(Category category){
         return categoryRepository.save(category);

    }

}
