package com.train;

import java.util.Scanner;

public class Main {

    private static int totaltickets;
    private static int roundtrip;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (totaltickets != -1) {
            System.out.print("Please enter number of tickets:");
            totaltickets = scanner.nextInt();
            if (totaltickets == -1)
                break;
            System.out.print("How many round-trip tickets:");
            roundtrip = scanner.nextInt();
            Ticket ticket = new Ticket(totaltickets, roundtrip);
            ticket.print();
            System.out.println();

        }
    }
}
