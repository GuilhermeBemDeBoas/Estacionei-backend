package com.mackenzie.estacionei.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.estacionei.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>  {

	List<Cliente> findByCpf(String cpf);

}
