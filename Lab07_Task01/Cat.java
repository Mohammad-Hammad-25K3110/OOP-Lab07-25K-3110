package Lab07_Tasks.Lab07_Task01;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows");
    }
}
