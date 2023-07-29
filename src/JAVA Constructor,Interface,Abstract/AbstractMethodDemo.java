abstract class LoknathPg {
    public abstract void student();
}

class Cigratte extends LoknathPg {
    public void student() {
        System.out.println("Prasun, Visha;, Soumik");
    }
}

class Hagu extends LoknathPg {
    public void student() {
        System.out.println("Swapnil");
    }
}

public class AbstractMethodDemo {
    public static void main(String[] args) {
        Cigratte obj = new Cigratte();
        obj.student();
    }
}
