class Test
{
    void display()
    {
        System.out.println("Hi");
    }
    void show()
    {
        display();   // autoamtically this.display() is added by the compiler if we don't use this
    }
}

public class InvokingClassMethod {
    public static void main(String[] args) {
        Test obj= new Test();
        obj.show();
    }
}
