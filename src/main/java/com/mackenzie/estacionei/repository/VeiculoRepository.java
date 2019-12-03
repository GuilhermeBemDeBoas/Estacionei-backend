package com.mackenzie.estacionei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.estacionei.entity.Veiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	List<Veiculo> findByPlaca(String placaVeiculo);

	@Query("SELECT v FROM Veiculo v WHERE v.cliente.idCliente = :idCliente")
	List<Veiculo> findByIdCliente(@Param("idCliente") Long idCliente);

}
