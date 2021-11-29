package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int[] RANDOM = new int[20];
    int a=0;
    int b=0;
    int c=0;
    for(int i=0; i < 20; i++){
        int randomnumber = (int)(Math.random() * 50);
        RANDOM[i] = randomnumber +1;
        a= RANDOM[i];
        b= c;
        c= a+b;
    }
    for(int pole : RANDOM){
        System.out.println(""+pole);
    }
    System.out.println("sucet:"+c);
    float priemer = c / 20;
    System.out.println("najvacsia hodnota:"+RANDOM[19]);
    System.out.println("najmensia hodnota:"+RANDOM[0]);
    System.out.println("priemerna hodnota:"+priemer);
    Arrays.sort(RANDOM);
    }
}




