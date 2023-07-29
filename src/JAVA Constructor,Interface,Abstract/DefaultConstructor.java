class A
{
    int a; String name;
    void show()
    {
        System.out.println(a+" "+name);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.show();
    }
}
