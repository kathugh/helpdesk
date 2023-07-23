package com.kathugh.helpdesk;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TicketService {
	private static List<Ticket> tickets = new ArrayList<>();

	
	static {
		tickets.add(new Ticket(1,"asdf","asdf","kat","kat"));
		tickets.add(new Ticket(2,"kat","kat","kat","kat"));
		tickets.add(new Ticket(3,"asdf","asdf","kat","kat"));
	}
	
 
	public List<Ticket> findByRequester(String requester){
		return tickets;
		//Predicate<? super Ticket> predicate_requester = ticket -> ticket.getRequester().equals(requester);
		//return tickets.stream().filter(predicate_requester).toList();
	}
	
	
	/*public void addTicket(String subject, String description, String category, String requester) {
		Ticket ticket = new Ticket(ticketId++, subject, description, category, requester);
		tickets.add(ticket);
	}*/
	
	
	
}
