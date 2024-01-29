package eserciziJava.interfacce;

import eserciziJava.esercizioAbstracts.Rettangolo;
import eserciziJava.esercizioAbstracts.Triangolo;

public class Main {
    public static void main(String[] args) {

        eserciziJava.esercizioAbstracts.Triangolo triangolo = new Triangolo(8, 8);
        eserciziJava.esercizioAbstracts.Rettangolo rettangolo = new Rettangolo(8, 8);

        System.out.println("l area del triangolo = " + triangolo.area());
        System.out.println("l area del rettangolo = " + rettangolo.area());

    }
}
