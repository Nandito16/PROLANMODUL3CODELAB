package org.example;

import java.util.Scanner;

public class KonversiUang {
    public static void main(String[] args) {
        double rateToUSD = 0.000064;
        double rateToEUR = 0.000059;
        double rateToJPY = 0.00958;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah Rupiah (IDR): ");
        double amountInUang = scanner.nextDouble();

        System.out.println("Pilih mata uang tujuan: ");
        System.out.println("1. Dolar AS (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Yen Jepang (JPY)");
        int choice = scanner.nextInt();

        double convertedAmount;
        switch (choice) {
            case 1:
                convertedAmount = amountInUang * rateToUSD;
                System.out.printf("%.2f IDR = %.2f USD\n", amountInUang, convertedAmount);
                break;
            case 2:
                convertedAmount = amountInUang * rateToEUR;
                System.out.printf("%.2f IDR = %.2f EUR\n", amountInUang, convertedAmount);
                break;
            case 3:
                convertedAmount = amountInUang * rateToJPY;
                System.out.printf("%.2f IDR = %.2f JPY\n", amountInUang, convertedAmount);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        scanner.close();
    }
}
