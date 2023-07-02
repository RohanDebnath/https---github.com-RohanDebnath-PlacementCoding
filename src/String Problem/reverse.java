import java.util.Scanner;

public class reverse {

    void reverseCheck(String str) {
        char charArray[] = str.toCharArray();
        int n = charArray.length;
        for (int i = 0; i < n / 2; i++) {
            charArray[i] = (char) (charArray[i] ^ charArray[n - i - 1]);
            charArray[n - i - 1] = (char) (charArray[i] ^ charArray[n - i - 1]);
            charArray[i] = (char) (charArray[i] ^ charArray[n - i - 1]);
        }
        String st = new String(charArray);
        System.out.println(st);
    }

    public static void main(String[] args) {
        String str;
        System.out.println("Enter your string");
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        reverse obj = new reverse();
        obj.reverseCheck(str);
    }

}
