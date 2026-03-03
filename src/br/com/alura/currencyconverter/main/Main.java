package br.com.alura.currencyconverter.main;

import br.com.alura.currencyconverter.models.CurrencyCodes;
import br.com.alura.currencyconverter.models.CurrencyDTO;
import br.com.alura.currencyconverter.services.CurrencyConverter;
import br.com.alura.currencyconverter.services.CurrencyQuery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CurrencyQuery query = new CurrencyQuery();
        int option = 0;

        while (option != 7) {
            System.out.println("-------------------------------");
            System.out.println("Welcome to Currency Converter");
            System.out.println("\n1) Real to Yuan");
            System.out.println("2) Yuan to Real");
            System.out.println("3) Real to Cuban Peso");
            System.out.println("4) Cuban Peso to Real");
            System.out.println("5) Real to Won");
            System.out.println("6) Won to Real");
            System.out.println("7) Quit");
            System.out.println("\nChoose an option: ");

            option = input.nextInt();

            if (option == 7) {
                break;
            }

            String base = "";
            String target = "";

            switch (option) {
                case 1 -> { base = CurrencyCodes.BRL; target = CurrencyCodes.CNY; }
                case 2 -> { base = CurrencyCodes.CNY; target = CurrencyCodes.BRL; }
                case 3 -> { base = CurrencyCodes.BRL; target = CurrencyCodes.CUP; }
                case 4 -> { base = CurrencyCodes.CUP; target = CurrencyCodes.BRL; }
                case 5 -> { base = CurrencyCodes.BRL; target = CurrencyCodes.KRW; }
                case 6 -> { base = CurrencyCodes.KRW; target = CurrencyCodes.BRL; }
                default -> {
                    System.out.println("Invalid option!");
                    continue;
                }
            }

            System.out.println("Enter the amount you would like to convert: ");
            double amount = input.nextDouble();

            try {
                CurrencyDTO dto = query.searchCurrency(base, target);
                double result = CurrencyConverter.convert(dto.conversion_rate(), amount);

                System.out.printf("Conversion Result: %.2f [%s] is equal to %.2f [%s]%n",
                        amount, base, result, target);
            } catch (RuntimeException e) {
                System.out.println("Error: "  + e.getMessage());
            }
        }
    }
}