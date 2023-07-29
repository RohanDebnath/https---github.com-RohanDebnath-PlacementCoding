class student
{
    int roll;        //
    String name;    // Had those been private then we cannot access them
    void input()   //
    {
        System.out.println("Enter roll and marks");
    }
}
public class SimpleInheritance extends student {
    void display()
    {
        roll=1;
        name="Rohan";
        System.out.println(name+" "+roll);
    }
    public static void main(String[] args) {
            SimpleInheritance obj = new SimpleInheritance();
            obj.input();
            obj.display();
    }    
}
