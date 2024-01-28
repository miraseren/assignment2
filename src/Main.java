import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection; // gives methods to work with group of objects like lists 
import java.util.Collections; // class that give methods for work with collections
import java.util.function.Predicate; // a condition that returns true or false

public class Main {
    public static void main(String[] args) {
        Person person1 = new Employee("Miras", "Yeren", "Lawyer", 1920000); // creating five employee objects
        Person person2 = new Employee("Ilyas", "Zhaksybayev", "Manager", 918000);
        Person person3 = new Employee("Russian", "Mbappe", "Jugde", 518000);
        Person person4 = new Employee("Nursultan", "Khaimuldin", "Programmer", 3200000);
        Person person5 = new Employee("Patrick", "Bob", "Armwrestler", 700000);

        Person person6 = new Student("Kazakh", "Messi", 1.17); // creating five student objects
        Person person7 = new Student("Olzhas", "Karabekov", 4.00);
        Person person8 = new Student("Nurasyl", "Khurmet", 3.27);
        Person person9 = new Student("Alken", "Zaiyr", 2.98);
        Person person10 = new Student("Bekzhan", "Chan", 2.13);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);

        Collections.sort(persons); //this method allows to sort the "persons"
        printData(persons); // print information about the sorted list of persons
    }

    static void printData(Iterable<Person> persons){ //this method goes through a collection of persons and print information about it

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}
