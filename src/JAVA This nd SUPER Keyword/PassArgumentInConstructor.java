class Test
{
    Test()
    {
        System.out.println("hi");
    }
}
public class PassArgumentInConstructor {
    void m1()
    {
        Test obj = new Test();
    }
    public static void main(String[] args) {
        PassArgumentInConstructor obj = new PassArgumentInConstructor();
        obj.m1();
    }
    
}
