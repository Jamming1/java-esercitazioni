public class Studente {
  private  String firstName;
  private String lastName;
  private  String ID;

    public Studente(String firstName, String lastName, String ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    };
    
    @Override
    public String toString(){
        String datiStudente = "Students data: "+ firstName + ", "+ lastName + " ," + ID;
        return datiStudente;
    };

    public String getFirstName(){
        return firstName;
    };

    public String getlastName(){
        return lastName;
    };

    public String ID(){
        return ID;
    };

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
}








//  Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, 
//cognome ed identificativo.
//  Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
// Nel main dichiarare un oggetto di tipo Studente.