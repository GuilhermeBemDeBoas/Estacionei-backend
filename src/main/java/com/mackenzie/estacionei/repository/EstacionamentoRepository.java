package com.mackenzie.estacionei.repository;

import com.mackenzie.estacionei.entity.Estacionamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, String> {

}
