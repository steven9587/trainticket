package com.train

import java.util.*

fun main(args: Array<String>) {
    var totaltickets = 0
    while (totaltickets != -1) {
        //val scanner = Scanner(System.`in`)
        print("Please enter number of tickets:")
        totaltickets = readLine()!!.toInt()
        if (totaltickets == -1)
            break;
        System.out.print("How many round-trip tickets:")
        var roundtrip = readLine()!!.toInt()
        val ticket = Coupon(totaltickets, roundtrip)
        ticket.print()
        println()
    }
}

class Coupon(var totaltickets: Int, var roundtrip: Int) {
    fun print() {
        val price: Int = ((totaltickets - roundtrip) * 1000 + roundtrip * 2000 * 0.9).toInt()
        println("Total tickets: " + totaltickets);
        println("Round-trip: " + roundtrip);
        println("Total: " + price);
    }
}