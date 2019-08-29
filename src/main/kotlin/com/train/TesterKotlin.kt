package com.train

import java.util.*

fun main() {
        val scanner = Scanner(System.`in`)
        println("Please enter number of tickets:")
        val totalTicketNumber = scanner.nextInt()
        println("How many round-trip tickets:")
        val roundTripTicketNumber = scanner.nextInt()

        val ticket = TicketKotlin(totalTicketNumber, roundTripTicketNumber)

        println(
            "Total tickets: " + totalTicketNumber + " Round-trip: " + roundTripTicketNumber +
            " Total: " + ticket.totalPrice()
        )
}

class TicketKotlin(var totalTicketNumber: Int, var roundTripTicketNumber: Int) {

    fun totalPrice():Int {
        val onewayTicketPrice = (totalTicketNumber - roundTripTicketNumber) * 1000
        val roundTripTicketPrice = (roundTripTicketNumber * 2000 * 0.9).toInt()
        return onewayTicketPrice + roundTripTicketPrice
    }
}