/**
 * Created by Administrator on 2016-10-19.
 */
public class Sprzeglo extends Komponent{
    private boolean stanSprzegla;

    public void zalacz(){
        stanSprzegla = true;
    }
    public void rozlacz(){
        stanSprzegla = false;
    }
    public boolean isStanSprzegla(){
        return stanSprzegla;
    }
}
