package com.mackenzie.estacionei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.estacionei.entity.Estacionamento;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Integer> {

}
