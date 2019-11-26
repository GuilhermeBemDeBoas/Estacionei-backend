package com.mackenzie.estacionei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.estacionei.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
