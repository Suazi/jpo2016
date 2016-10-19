/**
 * Created by Administrator on 2016-10-19.
 */
public class SkrzyniaBiegow extends Komponent{
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    Sprzeglo sprzeglo = new Sprzeglo();

    public void zmienBieg(int bieg){
        if(sprzeglo.isStanSprzegla()){
            aktualnyBieg = bieg;
        }

    }
    public void obliczPrzelozenie(){

    }
}
