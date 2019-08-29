package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int totalTicketNumber = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int roundTripTicketNumber = scanner.nextInt();

        Ticket ticket = new Ticket(totalTicketNumber,roundTripTicketNumber);

        System.out.println("Total tickets: "+ totalTicketNumber + " Round-trip: " + roundTripTicketNumber +
                " Total: " + ticket.totalPrice());



    }
}
