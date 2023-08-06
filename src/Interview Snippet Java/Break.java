
public class Break {
    int result(int n)
    {
        switch(n)
        {
            case 1:
            System.out.println("Hello");
            case 2:
            System.out.println("Soumik");
           // return 1;
            System.exit(0);
            case 3:
            System.out.println("Rohan");
            default :
            System.out.println("Hi");
        }
        return 0;
    }
    public static void main(String[] args) {
        Break obj= new Break();
        System.out.println(obj.result(1));
    }
    
}
/*
 
public class OperationChoice {
    int result(int a, int b, int c) {
        switch (c) {
            case 1:
                return (a + b);
               // break;
            case 2:
                return (a - b);
             //   break;
            case 3:
                return (a * b);
            //    break;
            case 4:
                return (a / b);

        }
        return 0;
    }

    public static void main(String[] args) {
        OperationChoice obj= new OperationChoice();
        System.out.println(obj.result(2, 6, 1));
    }
}

*/
