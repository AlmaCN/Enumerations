package it.develhope.exercise;

public class Start {

    public static void main(String[] args) {

        /*
        Ho creato un ciclo for che passasse attraverso l'enumeration
         */
        for(Month value : Month.values()) {
            System.out.println(value);

            /*
            Ho creato un if else per stampare se il mese finisce con la Y oppure no
             */
            if(value.toString().endsWith("Y")){
                System.out.println("Ends with Y");
            }else{
                System.out.println("Doesn't end with Y");
            }
        }
    }
}
