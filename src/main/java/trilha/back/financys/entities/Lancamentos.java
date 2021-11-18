package trilha.back.financys.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_lancamentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lancamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{name.not.blank}")
    @Size(min = 3, max = 15, message = "{name.size}")
    private String name;

    @NotBlank(message = "{description.not.blank}")
    @Size(min = 15, max = 50, message = "{description.size}")
    private String description;

    @NotBlank(message = "{type.not.blank}")
    @Size(min = 3, max = 10, message = "{type.size}")
    private String type;

    @NotNull(message = "{amount.not.null}")
    @Min(value = 0, message = "{amount.min}")
    private Double amount;

    @NotBlank(message = "{dataLancamento.not.blank}")
//    @JsonFormat(pattern = "dd/MM/yyyy")
      private String dataLancamento;

    @NotNull(message = "{paid.not.null}")
    private boolean paid;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Object findByCategoryId(Long id) {
        return getDataLancamento();
    };
}
