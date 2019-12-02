package com.mackenzie.estacionei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.estacionei.entity.Veiculo;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	List<Veiculo> findByPlaca(String placaVeiculo);


}
