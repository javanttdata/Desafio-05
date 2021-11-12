package trilha.back.financys.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.repositories.LancamentosRepository;
import trilha.back.financys.services.CategoryService;
import trilha.back.financys.services.LancamentosService;
import java.util.*;

@RestController
@RequestMapping("/api")
@Api(value="Desafio 3 Cybertron")
@CrossOrigin(origins ="*")
public class LancamentosController {



    @Autowired
    private LancamentosRepository lancamentosRepository;

    @Autowired
    private LancamentosService lancamentosService;

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/lancamentos")
    @ApiOperation(value = "Cria um lançamento")
    public ResponseEntity<?> create (@RequestBody Lancamentos lancamentos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentosService.create(lancamentos));
        }

    @GetMapping("/lancamentos")
    @ApiOperation(value= "Lista os Lancamentos")
    public ResponseEntity<List<Lancamentos>> findAll (@RequestParam (value = "paid", required = false)Boolean paid){
        List<Lancamentos> lancamentos = new ArrayList<>();
        if (Objects.isNull(paid)){
            lancamentos = lancamentosRepository.findAll();
        }else{
            lancamentos = lancamentosRepository.findByPaid(paid);
        }
        return ResponseEntity.ok(lancamentos);
    }

    @GetMapping("/lancamentos/{id}")
    @ApiOperation(value="Retorna os Lancamentos pelo ID")
    public ResponseEntity<Lancamentos> read(@PathVariable Long id){
        Lancamentos read = lancamentosRepository.findById(id).get();
        return ResponseEntity.ok(read);
    }

    @GetMapping(value = "/lancamentos/categoria/{categoryName}")
    @ApiOperation(value="Busca um ID de Categoria pelo Nome")
    public ResponseEntity<?> findByName (@PathVariable String categoryName){
        Long category = categoryService.idCategoryByName(categoryName);
        return ResponseEntity.ok(category);
    }

    @PutMapping(value = "/lancamentos/{id}")
    @ApiOperation(value="Atualiza os Lancamentos pelo ID")
    public ResponseEntity<Lancamentos> update(@PathVariable(name = "id") Long id, @RequestBody Lancamentos lancamentos){
        lancamentos.setId(id);
        lancamentosRepository.save(lancamentos);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/lancamentos/{id}")
    @ApiOperation(value="Deleta um Lancamento pelo ID")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteLancamentos(@PathVariable Long id){
        lancamentosRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
