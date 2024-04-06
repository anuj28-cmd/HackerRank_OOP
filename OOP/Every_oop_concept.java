package HackerRank_OOP.OOP;
// Define a class called "Person"
class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        System.out.println("Parametric Constructor called");
        this.name = name;
        this.age = age;
    }
    public Person() {
        System.out.println("Non Parametric Constructor called");
        this.name = "Unknown";
        this.age = 0;
    }


    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Every_oop_concept {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person = new Person("John Doe", 25);
        person.displayInfo();
    
        // Accessing instance variables using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying instance variables using setter methods
        person.setName("Jane Smith");
        person.setAge(30);
        person.displayInfo();
        

        person = new Person();
        person.displayInfo();

       
       
    }
}