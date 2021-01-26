package com.java.springboot.controller;


import com.java.springboot.dao.TicketRepository;

import com.java.springboot.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping("/bookTickets")
    public Ticket bookTicket(@RequestBody Ticket tickets) {
        return ticketRepository.save(tickets);
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }
}