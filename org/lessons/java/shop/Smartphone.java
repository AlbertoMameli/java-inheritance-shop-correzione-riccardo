package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto { // variabili d'istanza
    private String codiceImei;
    private int memoriaGb;

    public Smartphone(String nome, String marca, String descrizione, BigDecimal prezzo, String codiceImei, int memoriaGb) {
      super(nome, marca, descrizione, prezzo);
        this.codiceImei = codiceImei;
        this.memoriaGb = memoriaGb;
    }

    // get e set

    public String getCodiceImei() {
        return this.codiceImei.toUpperCase();
    }

    public void setCodiceImei(String codiceImei) {
        if (codiceImei.length() == 15) {
            this.codiceImei = codiceImei;
        } else {
            System.out.println("Codice imei non valido");
        }
    }

    public int getMemoriaGb (){
        return memoriaGb;

    }

    public void setMemoriaGb(int memoriaGb){
        if (memoriaGb < 12){
            System.out.println("Memoria in GB non disponibile");
        }else{
            this.memoriaGb = memoriaGb;
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodie imei: " + getCodiceImei() + "\nMemoria " +memoriaGb + " GB";
    }
}
