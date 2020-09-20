package com.example.simple;

public class TaxPayment {
    // Declare constants first (variables may use these constants)
    // The keyword "final" marked these as constant (i.e., cannot be changed).
    // Use uppercase words joined with underscore to name constants
    final double TAX_RATE_ABOVE_20K = 0.1;
    final double TAX_RATE_ABOVE_40K = 0.2;
    final double TAX_RATE_ABOVE_60K = 0.3;

    // Declare variables
    int taxableIncome;
    double taxPayable;

    public static void main(String[] args) {
        // Print results rounded to 2 decimal places
        System.out.println("The income tax payable is: $%.2f%n");
    }


}
