package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:");
    var totaltickets = scanner.nextInt();
    System.out.print("How many round-trip tickets:");
    var roundtrip = scanner.nextInt();
    val ticket = Coupon(totaltickets, roundtrip)
    ticket.print()
}

class Coupon(var totaltickets: Int, var roundtrip: Int) {
    fun print() {
        val price : Int = ((totaltickets-roundtrip)*1000+roundtrip*2000*0.9).toInt()
        println("Total tickets: "+totaltickets);
        println("Round-trip: "+roundtrip);
        println("Total: "+price);
    }
}