package trilha.back.financys.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    public ResponseEntity<Category> create(Category category){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryRepository.save(category));
    }

    public ResponseEntity<List<Category>> readAll(){
        List<Category> readAll = categoryRepository.findAll();
        return ResponseEntity.ok(readAll);
    }

    public ResponseEntity<Category> read(Long id){
        Category read = categoryRepository.findById(id).get();
        return ResponseEntity.ok(read);
    }

    public ResponseEntity<Category> update(Long id, Category category){
        category.setId(id);
        categoryRepository.save(category);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    public ResponseEntity<?> deleteCategory(Long id){
        categoryRepository.deleteById(id);
        return  ResponseEntity.status(HttpStatus.OK).build();
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
