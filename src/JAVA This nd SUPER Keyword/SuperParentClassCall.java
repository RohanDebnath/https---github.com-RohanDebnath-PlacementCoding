class a
{
    void m1()
    {
        System.out.println("HI");
    }
}
public class SuperParentClassCall extends a {
    void m1()
    {
        System.out.println("Hello");
    }
    void m2()
    {
        super.m1();
    }
    public static void main(String[] args) {
        SuperParentClassCall obj = new SuperParentClassCall();
        obj.m2();
    }
    
}
