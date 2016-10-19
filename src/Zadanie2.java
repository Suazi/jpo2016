//package edu.agh.ti;


import java.util.Random;

abstract class Animal {
    int iloscNog;

    public void live() {
        System.out.println("I can live.");
    }

    public String getName() {
        return "animal";
    }

    public void setIloscNog(int iloscNog){
        this.iloscNog = iloscNog;
    }
    public void wypisz(){
        System.out.println("Animal");
    }
}

class Bird extends Animal {

    public String getName() {
        return "bird";
    }

    public void fly() {
        System.out.println("I can fly!");
    }
    public void wypisz(){
        System.out.println("Bird");
    }
}

class Parrot extends Bird {
    public String getName() {
        return "parrot";
    }

    public void fly() {
        System.out.println("I can fly! I can fly!");
    }
    public void wypisz(){
        System.out.println("Parrot");
    }
}
class Dog extends Animal{
    public String getName() {
        return "animal";
    }
    public void bark(){
        System.out.println("Hau hau");
    }
    public void wypisz(){
        System.out.println("Dog");
    }

}
class Cat extends Animal{
    public String getName(){
        return "cat";
    }
    public void Meow(){
        System.out.println("Meow meow");
    }
    public void wypisz(){
        System.out.println("Cat");
    }
}

public class Zadanie2 {



    public static void main(String[] args) {

        Animal a;
        Bird b = new Bird();
        Parrot p = new Parrot();

        a = b;
        System.out.println(a.getName());

        a = p;
        System.out.println(a.getName());

        b = p;
        b.fly();

        p.live(); //dziedziczone!
        Animal tablica[] = new Animal[100]; //tablica 100
        Random r = new Random();
        for(int i = 0; i < 100; i++){
            int j = r.nextInt(4);
            switch (j){
                case 0:
                    tablica[i] = new Bird();
                    break;
                case 1:
                    tablica[i] = new Cat();
                    break;
                case 2:
                    tablica[i] = new Dog();
                    break;
                case 3:
                    tablica[i] = new Parrot();
                    break;
                default:
                    break;
            }
            tablica[i].wypisz();
        }

        short s = (short)10000000L; //jawne rzutowanie
        byte c = (byte)1000;
        long l = 10000; //domyśle rzutowanie
        /*for (int i = 0 ; i<100 ; i++)
            try {
                System.out.print("*");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }*/

    }


}