package com.mackenzie.estacionei.repository;

import com.mackenzie.estacionei.entity.Recibo;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ReciboRepository extends JpaRepository<Recibo, Long>{
    @Query("SELECT t FROM Recibo t WHERE CAST(t.dataHora AS LocalDate) = :data")
    List<Recibo> findByData(@Param("data") LocalDate data);
}
