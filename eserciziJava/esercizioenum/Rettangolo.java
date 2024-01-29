package eserciziJava.esercizioenum;
public class Rettangolo extends Forma{
    float base;
    float altezza;
    TipoForma myForm;

    public Rettangolo(float base, float altezza, TipoForma myForm) {
    }
    @Override
    public float calcolaArea() {
        System.out.println(base*altezza);

        System.out.println("Questa forma è un: "+myForm);
        return 0;
    }

}