package models;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private int id;
    private String name = "Name";
    private String surname = "Surname";

    public Person() {
        this("Name", "Surname");
    }

    public Person(String name, String surname) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override public String toString(){
        return id + ". " + name + " " + surname;
    }
    public abstract String getPosition();
    public String printInformation(){
        return toString() + " earns " + getPaymentAmount() + " tenge.";
    }
}
