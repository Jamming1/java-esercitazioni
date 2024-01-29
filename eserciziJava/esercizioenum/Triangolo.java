package eserciziJava.esercizioenum;

public class Triangolo extends Forma {
    float base;
    float altezza;
    TipoForma myForm;

    public Triangolo(float base, float altezza, TipoForma myForm) {
    }

    @Override
    public float calcolaArea() {

        System.out.println((base*altezza)/2);
        System.out.println("Questa forma è un: "+myForm);
        return 0;
    }
}
