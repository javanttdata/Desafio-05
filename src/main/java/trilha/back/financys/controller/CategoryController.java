package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.Category;
import trilha.back.financys.services.CategoryService;
import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
@Api(value="Desafio 3 Cybertron")
@CrossOrigin(origins ="*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/categorias")
    @ApiOperation(value = "Cria uma Categoria")
    public ResponseEntity<Category> create(@RequestBody @Valid Category category){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.save(category));
    }

    @GetMapping("/categorias")
    @ApiOperation(value="Retorna a lista de todas Categorias")
    public ResponseEntity<List<Category>> readAll(){
        List<Category> readAll = categoryService.readAll().getBody();
        return ResponseEntity.ok(readAll);
    }

    @GetMapping("/categorias/{id}")
    @ApiOperation(value="Retorna as Categorias pelo ID")
    public ResponseEntity<Category> read(@PathVariable Long id){
        Category read = categoryService.read(id).getBody();
        return ResponseEntity.ok(read);
    }

    @PutMapping(value = "/categorias/{id}")
    @ApiOperation(value="Atualiza as Categorias pelo ID")
    public ResponseEntity<Category> update(@PathVariable(name = "id") Long id, @RequestBody Category category){
        category.setId(id);
        categoryService.save(category);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/categorias/{id}")
    @ApiOperation(value="Deleta uma Categoria pelo ID")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
        return  ResponseEntity.status(HttpStatus.OK).build();
    }

}
