package models;

public class Student extends Person { //creating class Student and it extends(derive from another class) Person class // Student is a subclass of Person // inheritence
    private double gpa; // creating private variable

    public Student() { //creating a default constructor
        super(); // calling the constructor of a superclass
        gpa = 0; // initializing
    }

    public Student(String name, String surname, double gpa) { // constructor that takes 3 arguments
        super(name, surname); // calling the constructor of a superclass and passing parameters
        this.gpa = gpa;
    }

    public double getGpa() {  // getter method
        return gpa;
    }

    public void setGpa(double gpa) { //setter method
        this.gpa = gpa;
    }

    @Override
    public String toString() { //method to obtian String representation
        return "Student: " + super.toString(); // returns and concatenating two strings
    }

    @Override
    public String getPosition() { //getter method
        return "Student";
    }
    @Override
    public double getPaymentAmount() { // getter method
        return gpa > 2.67 ? 36660.0 : 0; // if the condition is true return 36660.0 ,otherwise 0
    }

    @Override
    public int compareTo(Person person){ //for ordering Student objects based on their payment amounts
        if(getPaymentAmount() == person.getPaymentAmount()) return 0; // if the payment amounts are equal the method returns 0.
        else if (getPaymentAmount() > person.getPaymentAmount()) return 1; // if the payment of current student > it returns 1
        else return -1; //otherwise -1
    }
}
