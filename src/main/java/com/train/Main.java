package com.train;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int totaltickets = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        int roundtrip = scanner.nextInt();
        Ticket ticket = new Ticket(totaltickets,roundtrip);
        ticket.print();
    }
}
