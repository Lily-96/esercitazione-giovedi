package entities;

import interfaces.CheckIn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Volontario volontario1 = new Volontario("giacomo", 25, "defoult");
        Volontario volontario2 = new Volontario("Giuseppe", 26, "Bravo");


        DipendenteFullTime dipendenteFullTime = new DipendenteFullTime("1616", 1356, "PRODUZIONE");
        DipendentePartTime dipendentePartTime = new DipendentePartTime("5463", "VENDITE", 80, 11);
        Dirigente dirigente = new Dirigente("3532", 2052, "AMMINISTRAZIONE");

        CheckIn[] turno = {
                volontario1,
                volontario2,
                dipendenteFullTime,
                dipendentePartTime,
                dirigente
        };

        for (CheckIn t : turno) {
            t.turno();
            System.out.println(t);

        }
        System.out.println("Salario del Dirigente è :" + dirigente.calculateSalary());
        System.out.println("Salario del dipendente FullTime è :" + dipendenteFullTime.calculateSalary());
        System.out.println("Salario del dipendente PartTime è :" + dipendentePartTime.calculateSalary());
    }

}



