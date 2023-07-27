abstract class animal {
    public abstract void sound();
}
class Dog extends animal {
    public void sound() {
        System.out.println("Woof woof");
    }
}
class Meow extends animal {
    public void sound() {
        System.out.println("Meow Meow");
    }
}
public class AbstractclassDemo {
    public static void main(String[] args) {
        Dog obj = new Dog();
        Meow obj1 = new Meow();
        obj.sound();
        obj1.sound();
    }
}
