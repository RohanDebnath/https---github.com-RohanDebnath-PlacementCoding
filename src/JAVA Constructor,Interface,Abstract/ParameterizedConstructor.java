class A
{
    A()
    {
        System.out.println("Hi");
    }
    void A(int x, int y)
    {
        System.out.println(x+y);
    }
}
public class ParameterizedConstructor {
public static void main(String[] args) {
    A obj= new A();
    obj.A(90, 10);
}
}
