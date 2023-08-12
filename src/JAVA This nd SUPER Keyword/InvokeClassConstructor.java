class Test
{
    Test()
    {
        this(10);
        System.out.println("No args");
    }
    Test(int a)
    {
        //this();
        System.out.println("Has args");
    }
}

public class InvokeClassConstructor {
 public static void main(String[] args) {
   
        Test obj= new Test();
    }
 }   

