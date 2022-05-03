package Novy;

public class Arena {
    private Bojovnik bojovnik1;
    private Bojovnik bojovnik2;
    private Kocka kocka;

public Arena(Bojovnik bojovnik1, Bojovnik bojovnik2, Kocka kocka){
    this.bojovnik1=bojovnik1;
    this.bojovnik2=bojovnik2;
    this.kocka = kocka;
}
private void vykresli(){
    System.out.println("----------Arena---------\n");
    System.out.println("Zdravi bojovniku: \n");
    System.out.println("%s %s\n", bojovnik1, bojovnik1.grafickyZivot());
    System.out.println("%s %s\n", bojovnik2, bojovnik2.grafickyZivot());
    }

private void vypisSpravu(String sprava){
    System.out.println(sprava);

    try {
        Thread.sleep(1000);
    }catch(InterruptedException ex){
        System.err.println("Chyna, nepovedlo se uspat vlakno;");
    }
}


public void zapas(){
    System.out.println("Vitaj v aréne");
    System.out.println("Dnes sa proti sebe postavia bojovnici " + this.bojovnik1 + " a " + this.bojovnik2);
    System.out.println("Zapas môže začať...");

    boolean zacinaBojovnik2 = kocka.hod() % 2 ==1;
    if

    while(bojovnik1.nazive() && bojovnik2.nazive()){
        bojovnik1.utoc(bojovnik2);
        vykresli();
        vypisSpravu(bojovnik1.vratPoslednuSpravu());
        vypisSpravu(bojovnik2.vratPoslednuSpravu());
        bojovnik2.utoc(bojovnik1);
        vykresli();
        vypisSpravu(bojovnik1.vratPoslednuSpravu());
        vypisSpravu(bojovnik2.vratPoslednuSpravu());
        System.out.println();
    }
}
}

