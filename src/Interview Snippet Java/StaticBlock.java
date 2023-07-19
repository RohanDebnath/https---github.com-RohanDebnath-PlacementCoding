class StaticBlock{
    public static void main(String a[]){
     
      System.out.println(test.a);
    }}  
    class test{
    static int a=m1();
    static{
     System.out.println("Inside static block");
    }
    static int m1(){
        System.out.println("Inside m1");
        return 20;
    }}