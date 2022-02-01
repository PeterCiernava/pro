package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kalkulacka kalkulacka = new Kalkulacka();
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadaj cislo a: ");
        kalkulacka.a= sc.nextInt();
        System.out.println("Zadaj cislo b: ");
        kalkulacka.b= sc.nextInt();

        kalkulacka.scitaj();

int vysledok = kalkulacka.odcitaj();
System.out.println(vysledok);

System.out.println("Vynasob vysledok: " + kalkulacka.vynasob());

System.out.println("Vydelenie vysledok: " + kalkulacka.vydel());



























        /*
        int a = 10;
       Zdravic z = new Zdravic();

       z.text= "Ahoj uzivatel";
       z.pozdrav("Peter");

       z.text = "Vitaj v klube";
       z.pozdrav("Tomas");

       Zdravic x = new Zdravic();
       x.text = "Vitaj ako sa mas?";
       x.pozdrav("Marek");

       Zdravic y = new Zdravic();
        y.text = "Gratulujem";
       y.pozdrav("Lukas");
        */
    }
}
