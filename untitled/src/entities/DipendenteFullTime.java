package entities;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, String Dipartimento) {
        super(matricola, stipendio, Dipartimento);
    }

    public void turno() {
        System.out.println("Checkin eseguito alle 8:00 ");
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }
}
