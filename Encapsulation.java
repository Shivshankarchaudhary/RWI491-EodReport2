
public class Encapsulation {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("Alice", 30);

        // Access data using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify data using setter methods
        person.setName("Bob");
        person.setAge(35);

        // Display updated information
        person.display();

        // Attempt to set an invalid age
        person.setAge(-10);
    }
}
