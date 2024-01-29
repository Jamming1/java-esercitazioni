package eserciziJava.interfacce;

public class Triangolo implements Forma{
    float base;
    float altezza;
    @Override
    public void calcolaArea() {
        System.out.println((base*altezza)/2);
    }
}
