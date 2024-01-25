import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person e1 = new Employee("Miras", "Yeren", "Lawyer", 5420);
        Person e2 = new Employee("Ilyas", "Zhaksybayev", "Manager", 4200);
        Person e3 = new Employee("Olzhas", "Karabekov", "Jugde", 1150000);
        Person e4 = new Employee("Dias", "Altynov", "Programmer", 163450);
        Person e5 = new Employee("Nurasyl", "Khurmet", "Armwrestler", 360500);

        Person s1 = new Student("Kazakh", "Messi", 2.81);
        Person s2 = new Student("Russian", "Mbappe", 2.17);
        Person s3 = new Student("Sponge", "Bob", 2.02);
        Person s4 = new Student("Alken", "Zaiyr", 3.14);
        Person s5 = new Student("Bekzhan", "Chan", 3.83);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(e3);
        persons.add(e4);
        persons.add(e5);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(s5);

        Collections.sort(persons);
        printInformation(persons);
    }

    static void printInformation(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}