package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import trilha.back.financys.DTO.CategoryDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.repositories.CategoryRepository;
import java.util.List;


@RestController
@RequestMapping("/api")
@Api(value="Desafio 3 Cybertron")
@CrossOrigin(origins ="*")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @PostMapping("/categorias")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Cria uma Categoria")
    public Category create(@RequestBody Category category){
        return repository.save(category);
    }

    @GetMapping("/categorias")
    @ApiOperation(value="Retorna a lista de todas Categorias")
    public ResponseEntity<List<Category>> readAll(){
        List<Category> readAll = repository.findAll();
        return ResponseEntity.ok(readAll);
    }

    @GetMapping("/categorias/{id}")
    @ApiOperation(value="Retorna as Categorias pelo ID")
    public ResponseEntity<Category> read(@PathVariable Long id){
        Category read = repository.findById(id).get();
        return ResponseEntity.ok(read);
    }

    @PutMapping(value = "/categorias/{id}")
    @ApiOperation(value="Atualiza as Categorias pelo ID")
    public ResponseEntity<Category> update(@PathVariable(name = "id") Long id, @RequestBody Category category){
        category.setId(id);
        repository.save(category);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/categorias/{id}")
    @ApiOperation(value="Deleta uma Categoria pelo ID")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategory(@PathVariable Long id){
        repository.deleteById(id);
    }

}
