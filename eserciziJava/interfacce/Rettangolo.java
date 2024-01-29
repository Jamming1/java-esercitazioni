package eserciziJava.interfacce;

public class Rettangolo implements Forma{
    float base;
    float altezza;
    @Override
    public void calcolaArea() {
        System.out.println(base*altezza);
    }
}
