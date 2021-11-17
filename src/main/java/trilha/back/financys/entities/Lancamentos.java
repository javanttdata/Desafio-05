package trilha.back.financys.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    private String name;
    private String description;
    private String type;
    private String amount;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataLancamento;
    private boolean paid;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Object findByCategoryId(Long id) {
        return getDataLancamento();
    };
}
