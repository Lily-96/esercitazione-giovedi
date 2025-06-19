package entities;

import interfaces.CheckIn;

public abstract class Dipendente implements CheckIn {
    private String matricola;
    private double stipendio;
    private String Dipartimento;

    public Dipendente(String matricola, double stipendio, String Dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.Dipartimento = Dipartimento;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getDipartimento() {
        return Dipartimento;
    }

    public void setDipartimento(String Dipartimento) {
        this.Dipartimento = Dipartimento;
    }


    public void CheckIn() {
        System.out.println("Checkin eseguito alle 14:00 ");
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", Dipartimento='" + Dipartimento + '\'' +
                '}';
    }
}
