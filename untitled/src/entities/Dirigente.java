package entities;

public class Dirigente extends Dipendente {
    public Dirigente(String matricola, double stipendio, String Dipartimento) {
        super(matricola, stipendio, Dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + 500;
    }
}
