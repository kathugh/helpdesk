package com.kathugh.helpdesk.service;

import java.util.List;
import java.util.function.Predicate;

import com.kathugh.helpdesk.Ticket;

import java.util.ArrayList;

public class TicketService {
	private static List<Ticket> tickets = new ArrayList<Ticket>();
	private int ticketId = 0;
	
	public List<Ticket> findByRequester(String requester){
		Predicate<? super Ticket> predicate_requester = ticket -> ticket.getRequester().equals(requester);
		List<Ticket> requester_tickets = new ArrayList<Ticket>();
		requester_tickets = tickets.stream().filter(predicate_requester).toList();
		return requester_tickets;	
	}
	
	
	public void addTicket(String subject, String description, String category, String requester) {
		Ticket ticket = new Ticket(ticketId++, subject, description, category, requester);
		tickets.add(ticket);
	}
	
	
	
}
