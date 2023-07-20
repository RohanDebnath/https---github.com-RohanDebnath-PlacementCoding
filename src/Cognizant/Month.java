import java.util.Scanner;

public class Month {
    String result(int n)
    {
        switch(n)
        {
            case 12:
            case 1:
            case 2:
            return "Winter";
           // break;
            case 3:
            case 4:
            case 5:
            return "Spring";
          //  break;
            case 6:
            case 7:
            case 8:
            return "Rainy";
         //   break;
            case 9:
            case 10:
            case 11:
            return "Autumn";
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Month obj = new Month();
        System.out.println(obj.result(n));
    }
}
