package com.masai2;

import java.util.Scanner;

public class Main {

	public static Ticket getDetails() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ticket ID");
		int ticketId = input.nextInt();
		
		System.out.println("Enter Price");
		int price = input.nextInt();
		
		System.out.println("Enter Available tickets");
		int availableTickets = input.nextInt();
		
		
		
		Ticket t1 = new Ticket();
		t1.setTicketid(ticketId);
		t1.setPrice(price);
		t1.setAvailableTickets(availableTickets);
		
		return t1;
	}
	
	public static int noOfTicket() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no of tickets: ");
		int noOfTickets = input.nextInt();
		return noOfTickets;
	}
	
	public static void main(String[] args) {
		
		Ticket t1 = Main.getDetails();
		
		int noticket = Main.noOfTicket();
		
		int amount = t1.calculateTicketCost(noticket);
		
		System.out.println("ticketId is: " + t1.getTicketid());
		System.out.println("The price:" + t1.getPrice());
		System.out.println("no of tickets: " + noticket);
		System.out.println("Available tickets: " + t1.getAvailableTickets());
		System.out.println("total amount " + amount);
		
	}
}
