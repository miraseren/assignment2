package models;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person>{
    static int idCounter = 1;
    int id;
    String name, surname;

    public Person(){
        id = idCounter++;
        name = "Name";
        surname = "Surname";
    }
    public Person(String name, String surname){
        id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    @Override public String toString(){
        return id + ". " + name + " " + surname;
    }
    public abstract String getPosition();
    public String printData(){
        return toString() + " earns " + getPaymentAmount() + " tenge.";
    }
}