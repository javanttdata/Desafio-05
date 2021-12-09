package testes;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.exceptions.LancamentoNuloException;
import trilha.back.financys.exceptions.NoContentException;
import trilha.back.financys.repositories.LancamentosRepository;
import trilha.back.financys.services.LancamentosService;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class TrilhaBackTestService {

    @InjectMocks
    private LancamentosService lancamentosService;

    @Mock
    private LancamentosRepository lancamentosRepository;


    @Test
    public void testaCriacaoLancamentos() throws LancamentoNuloException, NoContentException{
        List<Lancamentos> lancamentos = new ArrayList<>();
        Lancamentos lancamento = new Lancamentos();
        lancamento.setDataLancamento("12/12/2021");
        lancamento.setAmount("300");
        lancamento.setPaid(true);
        lancamentos.add(lancamento);

        when(lancamentosRepository.findAll()).thenReturn(lancamentos);

        Assertions.assertFalse(lancamentosService.getAll().isEmpty());
        Assertions.assertEquals(1, lancamentosService.getLancamentosDependentes("12/12/2021", "300", true).size());
    }

}
