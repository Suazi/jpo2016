public class Silnik extends Komponent{
    public void uruchom() {
        obroty = 800; //bieg jałowy
        System.out.println("silnik uruchomiony.");
        System.out.println("obroty = " + obroty);
    }

    public void zatrzymaj() {
        obroty = 0; //stop
        System.out.println("silnik zatrzymany.");
        System.out.println("obroty = " + obroty);
    }

    public void zwiekszObroty() {
        obroty = obroty + 100;
        if (obroty > maxObroty) obroty = maxObroty;
        System.out.println("obroty = " + obroty);
    }

    public void zmniejszObroty() {
        obroty = obroty - 100;
        if (obroty < 800) obroty = 800;
        System.out.println("obroty = " + obroty);
    }

    public final float maxObroty = 5000;
    public float obroty;

    public static void main(String[] args) {
        Silnik s = new Silnik();
        s.uruchom();
        s.zwiekszObroty();
        s.zatrzymaj();
    }
}
