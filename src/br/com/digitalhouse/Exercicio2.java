package br.com.digitalhouse;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int num1;
        int num2;

        System.out.println("digite numero 1...");

        Scanner scanner = new Scanner(System.in);

        num1 =  scanner.nextInt();

        System.out.println("digite numero 2...");

        num2 =  scanner.nextInt();

        System.out.println(verificaMenor(num1,num2));
    }

    public static boolean verificaMenor(Integer num1,Integer num2) {
        return num1 < num2;
    }
}
