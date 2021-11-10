package trilha.back.financys.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.LancamentosRepository;
import java.util.*;

@RestController
@RequestMapping("/api")
@Api(value="Desafio 3 Cybertron")
@CrossOrigin(origins ="*")
public class LancamentosController {

    //private final List<Lancamentos> list = new ArrayList<Lancamentos>();
    @Autowired
    private LancamentosRepository lancamentosRepository;
    private CategoryRepository categoryRepository;


    @PostMapping("/lancamentos")
    @ApiOperation(value = "Cria um lançamento")
    public Lancamentos create (@RequestBody Lancamentos lancamentos){
       Optional<Lancamentos> lancamentosEncontrado = lancamentosRepository.findById(lancamentos.getCategory().getId());
       if(lancamentosEncontrado.isEmpty()){
           System.out.println("===============================ERROR================================");
       }
       return lancamentosRepository.save(lancamentos);
    }

    @GetMapping("/lancamentos")
    @ApiOperation(value= "Lista os Lancamentos")
    public List<Lancamentos> findAll (@RequestParam (value = "paid", required = false)Boolean paid){
        List<Lancamentos> lancamentos = new ArrayList<>();
        if (Objects.isNull(paid)){
            lancamentos = lancamentosRepository.findAll();
        }else{
            lancamentos = lancamentosRepository.findByPaid(paid);
        }
        return lancamentos;
    }

    @GetMapping("/lancamentos/{id}")
    @ApiOperation(value="Retorna os Lancamentos pelo ID")
    public ResponseEntity<Lancamentos> read(@PathVariable(name = "id") Long id){
        Lancamentos read = lancamentosRepository.findById(id).get();
        return ResponseEntity.ok(read);
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
    public void deleteLancamentos(@PathVariable Long id){
        lancamentosRepository.deleteById(id);
    }

}
