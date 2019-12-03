package com.mackenzie.estacionei.repository;

import com.mackenzie.estacionei.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Query("SELECT t FROM Ticket t WHERE t.date BETWEEN :startDate AND :endDate")
    List<Ticket> getByDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
