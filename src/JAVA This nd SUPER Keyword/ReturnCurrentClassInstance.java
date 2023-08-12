
public class ReturnCurrentClassInstance {
    ReturnCurrentClassInstance m1()
    {
        return this;
    }
    public static void main(String[] args) {
        ReturnCurrentClassInstance obj= new ReturnCurrentClassInstance();
        obj.m1();
    }    
}
