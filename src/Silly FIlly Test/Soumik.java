 class Soumik {

   static int a=6;
  void result()
  { 
     a++;
     System.out.println(a);
  }
    public static void main(String[] args) {
     
        Soumik obj = new Soumik();
        obj.result();
        a++;
        System.out.println(Soumik.a);
     
    }
}
