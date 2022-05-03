
package Novy;
import java.util.Random;

public class Kocka {
    private Random random;
    private int pocetSten;

    public Kocka(int pocetStien){
        pocetSten= pocetStien;
        random = new Random();

    }
public Kocka(){
        pocetSten = 6;
        random= new Random();
}

    public int vratPocetStien(){
        return pocetSten;
    }
    public int hod(){
        return random.nextInt(pocetSten) + 1;
    }

}