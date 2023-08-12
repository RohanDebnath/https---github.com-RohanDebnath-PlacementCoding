class a
{
    int a=10;
}
class b extends a
{
    int a=20;
    void display(int a)
    {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        b obj = new b();
        obj.display(1000);

    }
}
