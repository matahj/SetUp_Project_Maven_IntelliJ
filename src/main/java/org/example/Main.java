package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do{
            System.out.println("Escribe un número para transformarlo en binario (0 para terminar):");
            number = sc.nextInt();
            String binary = Integer.toBinaryString(number);
            System.out.println("(" + number +") en base 10 = (" + binary + ") en base 2");
        }while (number > 0);
    }
}
