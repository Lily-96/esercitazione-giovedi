package entities;

import interfaces.CheckIn;

public class Volontario implements CheckIn {
    private String name;
    private int age;
    private String cv;


    public Volontario() {

    }

    public Volontario(String name, int age, String cv) {
        this.name = name;
        this.age = age;
        this.cv = cv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cv='" + cv + '\'' +
                '}';
    }


    public void turno() {
        System.out.println("Checkin eseguito alle 14:00 ");
    }
}
