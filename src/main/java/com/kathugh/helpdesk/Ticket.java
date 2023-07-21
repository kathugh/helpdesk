package com.kathugh.helpdesk;

public class Ticket {
	
	private int ticketId;
	private String subject;
	private String description;
	private String category;
	private String requester;
	//private Category category;
	//private String severity;
	//private String status;
	//private User requester;
	//private User responder;
	
	
	public Ticket(int ticketId, String subject, String description, String category, String requester) {
		super();
		this.ticketId = ticketId;
		this.subject = subject; //test
		
		this.description = description;
		this.category = category;
		this.requester = requester;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRequester() {
		return requester;
	}
	public void setRequester(String requester) {
		this.requester = requester;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", subject=" + subject + ", description=" + description + ", category="
				+ category + ", requester=" + requester + "]";
	}
	


	
	
}
