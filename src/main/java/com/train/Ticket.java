package com.train;

public class Ticket {

    int totalTicketNumber;
    int roundTripTicketNumber;

    public Ticket(int totalTicketNumber, int roundTripTicketNumber) {
        this.totalTicketNumber = totalTicketNumber;
        this.roundTripTicketNumber = roundTripTicketNumber;
    }

    public int totalPrice() {
        int onewayTicketPrice = (totalTicketNumber - roundTripTicketNumber) * 1000;
        int roundTripTicketPrice = (int) (roundTripTicketNumber * 2000 * 0.9);
        return onewayTicketPrice + roundTripTicketPrice;
    }
}
