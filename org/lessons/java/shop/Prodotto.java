package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

import org.lessons.java.Utilities.Stringhe;

public class Prodotto { // varidabili d'istanza
    private int codice;
    private String nome;
    private String descrizione;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // costruttore
    public Prodotto(String nome, String descrizione, BigDecimal prezzo) {
        Random randomGeneretor = new Random();
        this.codice = randomGeneretor.nextInt(11111111, 99999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22f);
    }

    // get e set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 2) { // se il nome è diversoda null e ha piùdi due caratteri allora...
            this.nome = nome;
        } else {
            System.out.println("Errore compilazione nome."); // altrimenti stampami questo messaggio

        }

    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca != null && marca.length() >= 2) { // se il nome è diversoda null e ha piùdi due caratteri allora...
            this.marca = marca;
        } else {
            System.out.println("Errore compilazione marca."); // altrimenti stampami questo messaggio
        }
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoBaseConIva() {
        return this.prezzo.add(this.prezzo.multiply(this.iva)); // mi dice...prendi il prezzo, sommalo a (prezzo che
                                                                // moltiplica iva)
    }

    public String getNomeEsteso() {
        return this.toString();
    }

    public String trasformaInTrattinato(String frase) {
        Stringhe stringheUtility = new Stringhe();
        return stringheUtility.sostituisciTulleLeOccorrenze(frase, ' ', '-');
    }

    @Override
    public String toString() {
        return String.format("%s-%s", this.codice, this.trasformaInTrattinato(this.nome));
    }

}
