package entities;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Volontario volontario1 = new Volontario("giacomo", 25, "defoult");


        Dipendente[] dipendenti = {
                new DipendenteFullTime("1616", 1356, "PRODUZIONE"),
                new Dirigente("3532", 2052, "AMMINISTRAZIONE"),
                new DipendentePartTime("5463", "VENDITE", 80, 11)
        };

        for (Dipendente d : dipendenti) {
            System.out.println(d);
            System.out.println("Stipendio calcolato : " + d.calculateSalary() + " euro");
        }
    }

}