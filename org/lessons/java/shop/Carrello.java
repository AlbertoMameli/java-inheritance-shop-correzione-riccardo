package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di prodotti che vuoi creare, max 5 prodotti");
        int numeroProdottiDaAggiungere = Integer.parseInt(scanner.nextLine());

        if (numeroProdottiDaAggiungere > 5){
            numeroProdottiDaAggiungere = 5;
        }
        Prodotto[] prodotti = new Prodotto[numeroProdottiDaAggiungere];
        for (int i = 0 ; i < prodotti.length ; i++){
            System.out.println("Inserisci il nome del prodotto");
            String nomeDelProdotto = scanner.nextLine();

            System.out.println("Inserisci la marca del prodotto");
            String marcaDelProdotto = scanner.nextLine();
        }


        scanner.close();
    }
    
}
