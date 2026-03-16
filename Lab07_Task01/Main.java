package Lab07_Tasks.Lab07_Task01;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog("Dog");
        Animal a2 = new Cat("Cat");
        Animal a3 = new Cow("Cow");
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}