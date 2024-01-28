import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person m1 = new Employee("Miras", "Yeren", "Lawyer", 19000);
        Person m2 = new Employee("Ilyas", "Zhaksybayev", "Manager", 360);
        Person m3 = new Employee("Olzhas", "Karabekov", "Jugde", 1000000);
        Person m4 = new Employee("Dias", "Altynov", "Programmer", 14200);
        Person m5 = new Employee("Nurasyl", "Khurmet", "Armwrestler", 777777);

        Person p1 = new Student("Kazakh", "Messi", 1.17);
        Person p2 = new Student("Russian", "Mbappe", 0.21);
        Person p3 = new Student("Patrick", "Bob", 3.05);
        Person p4 = new Student("Alken", "Zaiyr", 2.00);
        Person p5 = new Student("Bekzhan", "Chan", 3.83);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(m1);
        persons.add(m2);
        persons.add(m3);
        persons.add(m4);
        persons.add(m5);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        Collections.sort(persons);
        printInformation(persons);
    }

    static void printData(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}
