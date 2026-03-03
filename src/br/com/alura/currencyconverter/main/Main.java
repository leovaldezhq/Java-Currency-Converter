package br.com.alura.currencyconverter.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("Welcome to Currency Converter");
        System.out.println("\n1) Real to Yuan");
        System.out.println("2) Yuan to Real");
        System.out.println("3) Real to Cuban Peso");
        System.out.println("4) Cuban Peso to Real");
        System.out.println("5) Real to Won");
        System.out.println("6) Won to Real");
        System.out.println("\nChoose an option: ");

        input.nextLine();

    }
}
