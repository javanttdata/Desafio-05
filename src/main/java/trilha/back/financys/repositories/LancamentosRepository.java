package trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.entities.Lancamentos;

import java.util.List;

@Repository
public interface LancamentosRepository extends JpaRepository<Lancamentos, Long> {
    List<Lancamentos> findByPaid(Boolean paid);
}
