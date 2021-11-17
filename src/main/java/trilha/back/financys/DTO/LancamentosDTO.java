package trilha.back.financys.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import trilha.back.financys.entities.Category;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LancamentosDTO {

    private String name;
    private String description;
    private String type;
    private String amount;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataLancamento;

    private boolean paid;
    private Category category;




}
