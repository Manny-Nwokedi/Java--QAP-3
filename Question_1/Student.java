// Student.java
public class Student extends Person {
    protected String myIdNum;  // Student Id Number
    protected double myGPA;    // grade point average
    
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }
    
    public String getIdNum() {
        return myIdNum;
    }
    
    public double getGPA() {
        return myGPA;
    }
    
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }
    
    public void setGPA(double gpa) {
        myGPA = gpa;
    }
    
    public String toString() {
        return super.toString() + ", Student Id: " + myIdNum + ", GPA: " + myGPA;
    }
}