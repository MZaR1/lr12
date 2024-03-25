package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "ИМЯ";
        System.out.println("Hello, " + name);
        Tester tester = new Tester("Максимка", "123", 19);
        Tester.printTesterDetails(tester);
    }
}
class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private int salary;

    public Tester(String name) {
        this(name, "Unknown");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
    }
    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(int experience) {
        System.out.println("Name: " + name + ", Experience: " + experience);
    }

    public static void printTesterDetails(Tester tester) {
        System.out.println("Tester Details: " + tester.name + ", " + tester.surname);
    }
}
