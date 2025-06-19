package entities;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(String matricola, String Dipartimento, int oreLavorate, double pagaOraria) {
        super(matricola, 0, Dipartimento);
        this.oreLavorate = oreLavorate;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}
