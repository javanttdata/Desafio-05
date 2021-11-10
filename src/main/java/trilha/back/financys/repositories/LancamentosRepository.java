package trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.entities.Lancamentos;

import java.util.List;

public interface LancamentosRepository extends JpaRepository<Lancamentos, Long> {
    List<Lancamentos> findByPaid(Boolean paid);
}
