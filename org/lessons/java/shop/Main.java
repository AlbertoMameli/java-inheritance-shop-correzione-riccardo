package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Smartphone figo = new Smartphone("Iphone","Apple","Nuovo modello fighissimo",new BigDecimal(999.99), "usd564", 34);
       System.out.println(figo);


       Televisore tv = new Televisore("Nome bello", "Bellissimo", "Proprio un belm televisiore", new BigDecimal(99.99), 15, true);
       System.out.println(tv);



       scanner.close();
    }
}
