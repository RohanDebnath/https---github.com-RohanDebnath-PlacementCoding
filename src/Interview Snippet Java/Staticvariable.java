
public class Staticvariable {
    static int z; // This is a static variable

    public void setZ(int value) {
        z = value; // Non-static method accessing static variable
    }

    public void printZ() {
        System.out.println(z); // Non-static method accessing static variable
    }
public static void main(String[] args) {
    Staticvariable obj= new Staticvariable();
    obj.setZ(10);
    obj.printZ();

    System.out.println(Staticvariable.z); // No need of object at all
}    
}
