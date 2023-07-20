import java.util.Scanner;

public class AsciiProgram {
    char result(int num)
    {
        return ((char)(num));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        AsciiProgram obj = new AsciiProgram();
        System.out.println( obj.result(num));

    }
    
}
