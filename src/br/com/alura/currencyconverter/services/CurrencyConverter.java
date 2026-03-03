package br.com.alura.currencyconverter.services;

public class CurrencyConverter {
    public static double convert(double amount, double rate) {
        return amount * rate;
    }
}