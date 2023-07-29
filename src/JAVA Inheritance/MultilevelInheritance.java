class A { // Super Class
    void add() {
        System.out.println(10 + 20);
    }
}
class B extends A {
    void sub() {
        System.out.println(20 - 10);
    }
}
class C extends B {
    void mul() {
        System.out.println(10 * 20);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.add();
        obj.sub();
        obj.mul();
    }
}
