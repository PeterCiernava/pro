package Novy;

public class Main {
    public static void main(String[]args){
        Kocka desatStennaKocka = new Kocka(10);
        Bojovnik bojovnik = new Bojovnik("Lakatoš",100,20,10, desatStennaKocka );
        Bojovnik enemy = new Bojovnik("Tomáš",120, 15,5,desatStennaKocka);
        Arena arena = new Arena(bojovnik, enemy ,desatStennaKocka);

        arena.zapas();


    }

        /*
        System.out.println(bojovnik.grafickyZivot());
        System.out.println("Naživu: " + bojovnik.nazive());
        System.out.println(bojovnik.grafickyZivot());

        for (int i = 0; i < 3; i++)
        bojovnik.utoc(bojovnik);

        System.out.println(bojovnik);

        System.out.println(bojovnik.vratPoslednuSpravu());
        System.out.println(enemy.vratPoslednuSpravu());

        System.out.println(bojovnik);
        System.out.println("Naživu: " +bojovnik.nazive());
        System.out.println(bojovnik.grafickyZivot());
        Kocka desatStennaKocka = new Kocka(10);
        Kocka sestStennaKocka=new Kocka ();
        Kocka dvadsatStennaKocka = new Kocka (20);

        System.out.println(desatStennaKocka.vratPocetStien());
        System.out.println(sestStennaKocka.vratPocetStien());
        System.out.println(dvadsatStennaKocka.vratPocetStien());

        System.out.println("Desat-stenna kocka hody:");
for (int i = 0; i < 10; i++){
            System.out.print(desatStennaKocka.hod()+ " ");
        }
        System.out.println();
        System.out.println("Sest-stenna kocka hody: ");
        for (int i = 0; i < 10; i++){
            System.out.print(sestStennaKocka.hod()+ " ");
        }
        System.out.println();
        System.out.println("Dvadsatpat-stenna kocka hody: ");
        for (int i = 0; i < 10; i++){
            System.out.println();
        }

    }*/

}