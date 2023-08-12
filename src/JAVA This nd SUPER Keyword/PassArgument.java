public class PassArgument {

    void m1(PassArgument obj )
    {
        System.out.println("I am in method 1");
    }
    void m2()
    {
        m1(this);
    }
public static void main(String[] args) {
    PassArgument obj = new PassArgument();
    obj.m2();
}    
}
