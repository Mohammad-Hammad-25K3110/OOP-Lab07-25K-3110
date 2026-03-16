package Lab07_Tasks.Lab07_Task01;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " moos");
    }
}
