package testes;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import trilha.back.financys.controller.LancamentosController;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.services.LancamentosService;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class TrilhaBackTestes {

    private MockMvc mockMvc;

    @Mock
    private LancamentosService lancamentosService;

    @InjectMocks
    private LancamentosController lancamentosController;


    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(lancamentosController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
                .build();
    }

    @Test
    public void verificaValoresFiltradosStatusOK() throws Exception{

        Lancamentos lancamentos = new Lancamentos();
        lancamentos.setDataLancamento(lancamentos.getDataLancamento());
        lancamentos.setAmount(lancamentos.getAmount());
        lancamentos.setPaid(lancamentos.getPaid());

        when(lancamentosService.getLancamentosDependentes(lancamentos.getDataLancamento(), lancamentos.getAmount(), lancamentos.getPaid())).thenReturn(Collections.singletonList(lancamentos));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/lancamentos/filter")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        }
}
