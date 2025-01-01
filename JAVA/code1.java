// Base class Animal
class Animal {
    // Method to be overridden by subclasses
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class Dog extends Animal
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat extends Animal
class Cat extends Animal {
    // Overriding the sound() method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of each class
        Animal myAnimal = new Animal(); // Object of the base class
        Animal myDog = new Dog();      // Object of the derived class Dog
        Animal myCat = new Cat();      // Object of the derived class Cat

        // Calling the sound() method for each object
        myAnimal.sound(); // Calls Animal's sound() method
        myDog.sound();    // Calls Dog's sound() method
        myCat.sound();    // Calls Cat's sound() method
    }
}