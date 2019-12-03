package com.mackenzie.estacionei.repository;

import com.mackenzie.estacionei.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
