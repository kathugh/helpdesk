package com.kathugh.helpdesk;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class TicketController {
	
	
	public TicketController(TicketService ticketService) {
		super();
		this.ticketService = ticketService;
	}
	
	private TicketService ticketService;

	@RequestMapping("list-tickets")
	public String listAllTickets(ModelMap model) {
		List<Ticket> tickets = ticketService.findByRequester("kat");
		model.addAttribute("tickets", tickets);
		
		return "listTickets";
	}
	
	@RequestMapping("add-ticket")
	public String showNewTicketPage() {
		return "addTicket";
	}
	
	
}
