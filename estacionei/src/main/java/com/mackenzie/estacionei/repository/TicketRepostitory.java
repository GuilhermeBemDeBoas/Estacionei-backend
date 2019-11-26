package com.mackenzie.estacionei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.estacionei.entity.Ticket;

public interface TicketRepostitory extends JpaRepository<Ticket, Long>{

}
