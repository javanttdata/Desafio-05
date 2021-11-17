package trilha.back.financys.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LancamentosDTO {

    private String categoryName;
    private String description;
    private String type;
    private String amount;

}
