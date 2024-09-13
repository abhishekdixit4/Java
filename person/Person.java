public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor 1: No arguments
    public Person() {
        // Calls Constructor 2
        this("Unknown", 0, "Not specified");
    }

    // Constructor 2: Name and age
    public Person(String name, int age) {
        // Calls Constructor 3
        this(name, age, "Not specified");
    }

    // Constructor 3: Name, age, and address
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Using Constructor 1
        Person person1 = new Person();
        person1.displayInfo();

        System.out.println();

        // Using Constructor 2
        Person person2 = new Person("Alice", 30);
        person2.displayInfo();

        System.out.println();

        // Using Constructor 3
        Person person3 = new Person("Bob", 25, "123 Elm Street");
        person3.displayInfo();
    }
}
