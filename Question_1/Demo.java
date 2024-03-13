// Demo.java
public class Demo {
    public static void main(String[] args) {
        Person Manny = new Person("Coach Manny", 38, "Male");
        System.out.println(Manny);
        
        Student Cynthia = new Student("Cynthia Ojo", 31, "Female", "ORQ200", 3.5);
        System.out.println (Cynthia);
        
        Teacher mrSpot = new Teacher("Goku Spot", 34, "M", "Biology", 50000);
        System.out.println(mrSpot);
        
        CollegeStudent falcon = new CollegeStudent("Falcon Thunder", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(falcon);
    }
}