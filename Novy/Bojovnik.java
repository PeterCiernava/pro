package Novy;

public class Bojovnik {
    private String meno;
    private int zivot;
    private int maxZivot;
    private int utok;
    private int obrana;
    private Kocka kocka;
    private String sprava;

public Bojovnik(String meno, int zivot, int utok, int obrana, Kocka kocka){
    this.meno = meno;
    this.zivot = zivot;
    this.maxZivot = zivot;
    this.utok = utok;
    this.obrana = obrana;
    this.kocka = kocka;
    }
    @Override
    public String toString(){
    return meno;
    }
    public boolean nazive(){
    return (zivot > 0);
    }
    public String grafickyZivot(){
    String s = "[";
    int celkom =20;
    double pocet = Math.round((double)zivot / maxZivot * celkom);

    if(pocet== 0 && nazive());{
    pocet = 1;
    }

    for(int i=0; i< pocet; i++){

    }
        s += "#";
    return s;
}
public void branSa(int uder) {
    int zranenie = uder - (obrana + kocka.hod());

    if (zranenie > 0) {
        zivot -= zranenie;
        sprava = this.meno + "utrpel poškodenie " + zranenie + "hp";
        if (zivot <= 0) {
            zivot = 0;
            sprava += "a zomrel";
        }
    } else {
        sprava = this.meno + "odrazil útok a nestratil HP";
        {
            nastavSpravu(sprava);
        }
    }
}
public void utoc(Bojovnik nepriatel){
int uder = utok +kocka.hod();
nepriatel.branSa(uder);
}
public void nastavSpravu(String sprava){
    this.sprava = sprava;
}

public String vratPoslednuSpravu(){
    return sprava;
    }
}



