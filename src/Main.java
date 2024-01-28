import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Employee("Miras", "Yeren", "Lawyer", 192000);
        Person person2 = new Employee("Ilyas", "Zhaksybayev", "Manager", 918000);
        Person person3 = new Employee("Olzhas", "Karabekov", "Jugde", 518000);
        Person person4 = new Employee("Dias", "Altynov", "Programmer", 14200000);
        Person person5 = new Employee("Nurasyl", "Khurmet", "Armwrestler", 700000);

        Person person6 = new Student("Kazakh", "Messi", 1.17);
        Person person7 = new Student("Russian", "Mbappe", 4.00);
        Person person8 = new Student("Patrick", "Bob", 3.27);
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

        Collections.sort(persons);
        printData(persons);
    }

    static void printData(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.printData());
        }
    }
}
