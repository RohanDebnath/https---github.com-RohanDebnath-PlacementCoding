abstract class car{
    public abstract void drive();
    void playmusic(){
        System.out.println("Playing Music...");
    }
    public abstract void fly();
    public abstract void cry();
}
abstract class f1 extends car{
    public void drive(){
        System.out.println("Driving....");
    }}
class f2 extends f1 {
    public void fly(){
        System.out.println("flying....");
    }
    public void cry(){
        System.out.println("Bambutika....");
    }
    
}
public class AbstractClass{
    public static void main(String args[])
    {
        f2 ob=new f2();
        ob.drive();
        ob.playmusic();
        ob.fly();
        ob.cry();
    }}