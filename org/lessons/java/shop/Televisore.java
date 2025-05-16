package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto { // variabili d'istanza
    private int pollici;
    private boolean isSmartTv;


    public Televisore(String nome, String marca, BigDecimal prezzo, int pollici, boolean isSmartTv) { // costruttore tv
        super(nome, marca, prezzo);
        this.pollici = pollici;
        this.isSmartTv = isSmartTv;

    }

    public int getPollici(){
        return pollici;
    }

    public void setPollici(int pollici){
        if (pollici < 18 || pollici > 98){
            System.out.println("I pollici da leiinseriti non corrispondono a verita");
        }else{
            this.pollici = pollici;
        }
    }

    public boolean getIsSmartTv(){
        return isSmartTv;
    }

    public void setIsSmartTv(boolean isSmartTv){
        if (isSmartTv == true){ //if(isSmartTv)
            System.out.println("Hai aggiunto sul carrello una SmartTv");
            this.isSmartTv = isSmartTv;
        }else{
            System.out.println("La sua televisione non è SmartTv.");
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nDimensioni tv : " + getPollici() + "\nSmart tv : " + getIsSmartTv();
    }
    
}
