import java.util.Arrays;
import java.util.Scanner;

public class Anagramm {

    int checkAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        int check = 0;
        if (s1.length() != s2.length()) {
            check = 0;
        } else {
            char[] s1arr = s1.toLowerCase().toCharArray();
            char[] s2arr = s2.toLowerCase().toCharArray();
            Arrays.sort(s1arr);
            Arrays.sort(s2arr);
            if (Arrays.equals(s1arr, s2arr)) {
                check = 1;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        String str1, str2;
        System.out.println("Enter first string");
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        System.out.println("Enter second string");
        str2 = sc.nextLine();
        Anagramm obj = new Anagramm();
        System.out.println(obj.checkAnagram(str1, str2));
    }
}
