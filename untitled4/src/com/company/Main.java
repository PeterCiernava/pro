package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int a, x, s, middle, last, first, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadajte velkost pola: ");
        a = scan.nextInt();
        int[] arr = new int[a];
        System.out.print("Zadaj " +a+" cisla: ");
        for(x=0; x<a; x++)
            arr[x] = scan.nextInt();
        for(x=0; x<(a-1); x++)
        {
            for(y=0; y<(a-y-1); y++)
            {
                if(arr[y]>arr[y+1])
                {
                    z = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = z;
                }
            }
        }
        System.out.println("\nZorad pole:");
        for(x=0; x<a; x++)
            System.out.print(arr[x]+ " ");
        System.out.print("\n\nZadaj cislo: ");
        s = scan.nextInt();
        first = 0;
        last = a-1;
        middle = (first + last)/2;
        while(first <= last) {
            if (arr[middle] < s)
                first = middle + 1;
            else if (arr[middle] == s) {
                System.out.println("\nCislo bolo najdene:" + middle + ", Pozicia cisla:" + (middle + 1));
                break;
            } else
                last = middle - 1;

            middle = (first + last) / 2;
        }
        if(first>last)
            System.out.println("\nCislo, ktore si zadal sa nenachadza v poli");
    }
}
