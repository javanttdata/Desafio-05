//package testes;
//
//import org.junit.Before;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
//import trilha.back.financys.controller.LancamentosController;
//import trilha.back.financys.entities.Lancamentos;
//import trilha.back.financys.services.LancamentosService;
//
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//public class TrilhaBackTestes {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private LancamentosService lancamentosService;
//
//    @InjectMocks
//    private LancamentosController lancamentosController;
//
//    @Before
//    public void setUp(){
//        MockitoAnnotations.openMocks(this);
//        mockMvc = MockMvcBuilders
//                .standaloneSetup(lancamentosController)
//                .build();
//    }
//
//    @Test
//    public void verificaValoresNaoNulos() throws Exception{
//        Lancamentos lancamentos = new Lancamentos();
//        lancamentos.setDataLancamento(lancamentos.getDataLancamento());
//        lancamentos.setAmount(lancamentos.getAmount());
//        lancamentos.setPaid(lancamentos.getPaid());
//
//        when(lancamentosService.getLancamentosDependentes(lancamentos.getDataLancamento(), lancamentos.getAmount(), lancamentos.getPaid()));
//        assertNotNull(lancamentosService.getLancamentosDependentes());
//
//
//
//
//
//    }
//}
