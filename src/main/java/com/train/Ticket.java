package com.train;

public class Ticket {
int totaltickets;
int roundtrip;

    public Ticket(int totaltickets, int roundtrip) {
        this.totaltickets = totaltickets;
        this.roundtrip = roundtrip;
    }

    public void print(){
        int price = (int) ((totaltickets-roundtrip)*1000+roundtrip*2000*0.9);
        System.out.println("Total tickets: "+totaltickets);
        System.out.println("Round-trip: "+roundtrip);
        System.out.println("Total: "+price);
    }
}
