package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        //System.out.println("Hello World");

        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0d;
        umaCadeiaDeTexto = "Cadeia de texto";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("Soma de A + B é igual a " + (umNumeroA+umNumeroB));
        System.out.println("Subtração de A - B é igual a " + (umNumeroA-umNumeroB));
        System.out.println("digite ...");

        Scanner scanner = new Scanner(System.in);

        umNumeroA = scanner.nextInt();
        System.out.println("Recebi : " + umNumeroA);
    }
}
