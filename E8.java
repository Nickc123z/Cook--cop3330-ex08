/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {

        int people = 0;
        int pizzas = 0;
        int slices = 0;
        int total = 0;
        int quotient = 0;
        int remainder = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many people? ");
        people=scan.nextInt();

        System.out.print("How many pizzas do you have? ");
        pizzas=scan.nextInt();
        System.out.print("How many slices of pizza? ");
        slices=scan.nextInt();

        total=pizzas*slices;

        System.out.println(" "+people+" people with "+pizzas+" pizzas ("+total+"slices)");
        quotient = total/people;
        System.out.println("Each person gets "+quotient+" pieces of pizza");
        remainder= total%people;
        System.out.println("There are "+remainder+" leftover pieces");
    }
}