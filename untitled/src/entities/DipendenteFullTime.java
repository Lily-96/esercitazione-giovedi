package entities;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, String Dipartimento) {
        super(matricola, stipendio, Dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
