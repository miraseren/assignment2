package models;

public class Student extends Person {
    private double gpa;

    public Student() {
        super();
        gpa = 0;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public String getPosition() {
        return "Student";
    }
    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.0 : 0;
    }

    @Override public int compareTo(Person person){
        if(getPaymentAmount() == person.getPaymentAmount()) return 0;
        else if (getPaymentAmount() > person.getPaymentAmount()) return 1;
        else return -1;
    }
}
