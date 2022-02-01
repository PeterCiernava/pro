package com.company;

public class Kalkulacka {

    public int a;
    public int b;

    public void scitaj(){
        int vysledok = a + b;
        System.out.println(vysledok);

    }
    public int odcitaj(){
        int vysledok= a- b;
        return vysledok;

    }
    public int vynasob(){
        return a * b;

    }
    public double vydel(){
        if(b == 0){
            System.out.println("Nulou sa delit neda");
            return 0;
        }

        return (double) a / (double) b;


    }

}
