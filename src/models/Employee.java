package models;

public class Employee extends Person { //we use inheritence ,defining class Employee that inherits properties and behaviors from the Person class,extend(derive from another class)
    private String position; //  represents the job position
    private double salary; // salary of the employee

    public Employee() { // creating constructor
        super(); //calls the constructor of the superclass Person // super must be the first statement in subclass contructor//call a superclass`s constructor
        position = "Position";
        salary = 0;
    }

    public Employee(String name, String surname, String position, double salary) { // creating constructor
        super(name, surname); // calling the constructor of a superclass and passing parameters
        this.position = position; //assigning the value of position
        this.salary = salary; //assigning the value of salary
    }

    public String getPosition() { //declaring getter method
        return position; // returns position when the method will be called
    }

    public void setPosition(String position) { // declaring setter method ,setting the value of variable
        this.position = position; // assigning the value to variable
    }

    public double getSalary() { // declaring getter method
        return salary; // returns salary when the method will be called
    }

    public void setSalary(double salary) { // declaring setter method ,setting the value of variable
        this.salary = salary; // assigning the value to variable
    }

    @Override//says child class has the same method as declared in the parent class

    public String toString() { // method to obtain String and return type String
        return "Employee: " + super.toString(); // call the toString method of the superclass
    }

    @Override
    public double getPaymentAmount() { // gettter method that will return double value
        return salary; // returns salary when the method will be called
    }

    @Override
    public int compareTo(Person person) { // method that compares the salary of persons and used to define ordering based on the salary
        return Double.compare(salary, person.getPaymentAmount()); // compares two double values
    }
}
