class Test
{
    int i;
    void setVal(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.setVal(10);
        obj.show();
    }
}
