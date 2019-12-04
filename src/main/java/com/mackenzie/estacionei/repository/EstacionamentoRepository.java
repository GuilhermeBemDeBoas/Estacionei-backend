package com.mackenzie.estacionei.repository;

import com.mackenzie.estacionei.entity.Estacionamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Long> {
    List<Estacionamento> findByNomeContainingIgnoreCase(String name);
}
