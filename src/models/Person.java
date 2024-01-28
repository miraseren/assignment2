package models;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person>{ // creating abstract class that implement two interfaces/
    static int idCounter = 1; // creating static variable
    int id; // id variable
    String name, surname; // representing name and surname

    public Person(){ // declaring constructor
        id = idCounter++; // incrementing id value
        name = "Name"; //value of name
        surname = "Surname"; //value of surname
    }
    public Person(String name, String surname){ // declaring constructor
        id = idCounter++; //incrementing id value
        this.name = name; // assigning the values
        this.surname = surname; // assigning the values
    }

    public void setName(String name) { // setter method
        this.name = name; //
    }
    public void setSurname(String surname){ //setter method
        this.surname = surname;
    }
    public int getId(){ //getter method
        return id;
    }
    public String getName(){ // getter method
        return name;
    }
    public String getSurname(){ //getter method
        return surname;
    }

    @Override
    public String toString(){ //method to obtian String representation
        return id + ". " + name + " " + surname; // concatenating id name surname
    }
    public abstract String getPosition();   // declaring abstract method
    public String printData(){ // declaring method that prints Data
        return toString() + " earns " + getPaymentAmount() + " tenge."; // returns concatenation two methods
    }
}
