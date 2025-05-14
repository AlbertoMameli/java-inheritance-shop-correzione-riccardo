package org.lessons.java.Utilities;

public class Stringhe {
    public String sostituisciTulleLeOccorrenze (String stringaDaModificare, char carattereDaSostituire, char carattereSostituente){
        StringBuilder stringBuilder = new StringBuilder(stringaDaModificare);

        //ciclo
        for(int i = 0; i < stringaDaModificare.length();i++){
            if(stringaDaModificare.charAt(i) == carattereDaSostituire){
                stringBuilder.setCharAt(i, carattereSostituente);
            }
        }
        return stringBuilder.toString();
    }
}
