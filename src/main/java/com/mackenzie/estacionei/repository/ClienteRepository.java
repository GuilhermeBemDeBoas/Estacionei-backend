package com.mackenzie.estacionei.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.estacionei.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

	List<Cliente> findByCpf(String cpf);

	List<Cliente> findByNomeContainingIgnoreCase(String nome);

}
