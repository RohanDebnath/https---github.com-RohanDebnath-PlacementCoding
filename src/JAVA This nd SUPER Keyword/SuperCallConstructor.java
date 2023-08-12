class a
{
    a()
    {
        System.out.println("Class a");
    }
}
public class SuperCallConstructor extends a {
    SuperCallConstructor()   
    {
        // automatically compiler  makes super() here; 
        System.out.println("class scc");
    }
    public static void main(String[] args) {
        SuperCallConstructor obj = new SuperCallConstructor();
        
    }
    
}
