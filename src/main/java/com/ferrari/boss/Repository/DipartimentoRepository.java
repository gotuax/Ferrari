package com.ferrari.boss.Repository;

import com.ferrari.boss.Model.Dipartimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DipartimentoRepository extends JpaRepository<Dipartimento, Integer> {

    Dipartimento findDipartimentoByIdDipartimento(Integer id);

    @Query(value = "SELECT * FROM dipartimento WHERE nomeReparto LIKE CONCAT('%', ?1, '%')", nativeQuery = true)
    Dipartimento findDipartimentoByNomeReparto(String nomeReparto);

    @Query("SELECT d from Dipartimento d where d.sedeGeografica like %?1%")
    List<Dipartimento> findDipartimentoBySedeGeografica(String sedeGeografica);

}
