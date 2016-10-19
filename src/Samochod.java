import java.awt.*;
class Komponent{
    private String nazwa;
    private int waga;
    private int cena;
    private String producent;

    public String getNazwa(String nazwa) {
        this.nazwa = nazwa;
        return nazwa;
    }
    public int getWaga(int waga){
        this.waga = waga;
        return waga;
    }
    public int getCena(int cena){
        this.cena = cena;
        return cena;
    }

    public String getProducent(String producent) {
        this.producent = producent;
        return producent;
    }
}
public class Samochod{
    Color kolor;
    int nrRejestr;
    String model;
    String marka;
    final int maxPredkosc = 180;
    int predkosc;
    Silnik silnik = new Silnik();

    public void wlacz() {
        silnik.uruchom();
        System.out.println("silnik wlaczony");
    }

    public void wylacz() {
        System.out.println("silnik wylaczony");
    }

    public void jazda() {
        predkosc = 70;
        System.out.println("auto jedzie");
    }
}


