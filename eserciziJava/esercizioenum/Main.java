package eserciziJava.esercizioenum;

import eserciziJava.esercizioenum.Rettangolo;
import eserciziJava.esercizioenum.Triangolo;

public class Main {
    public static void main(String[] args) {


        Triangolo triangolo = new Triangolo(8, 8,TipoForma.TRIANGOLO);
        Rettangolo rettangolo = new Rettangolo(8, 8,TipoForma.RETTANGOLO);

        System.out.println("l' area del triangolo è = " + triangolo.calcolaArea());
        System.out.println("l'area del rettangolo è = " + rettangolo.calcolaArea());

    }
}
