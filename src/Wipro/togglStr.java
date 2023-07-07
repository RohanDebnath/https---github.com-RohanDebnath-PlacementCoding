
import java.util.Scanner;

public class togglStr {

    String result(String input1, int input2) {

        StringBuilder sb = new StringBuilder();
        if (input2 == 0) {
            for (int i = 0; i < input1.length(); i += 2) {
                char ch = input1.charAt(i);
                if (Character.isUpperCase(ch)) {
                    char ch1 = Character.toLowerCase(input1.charAt(i));
                    sb.append(ch1);
                }
                if (Character.isLowerCase(ch)) {
                    char ch1 = Character.toUpperCase(input1.charAt(i));
                    sb.append(ch1);
                }
            }
        } else if (input2 == 1) {
            for (int i = 1; i < input1.length(); i += 2) {
                char ch = input1.charAt(i);
                if (Character.isUpperCase(ch)) {
                    char ch1 = Character.toLowerCase(input1.charAt(i));
                    sb.append(ch1);
                }
                if (Character.isLowerCase(ch)) {
                    char ch1 = Character.toUpperCase(input1.charAt(i));
                    sb.append(ch1);
                }
            }
        } else if (input2 == 2) {
            StringBuilder sb1 = new StringBuilder(input1);
            input1 = sb1.reverse().toString();
            for (int i = 0; i < input1.length(); i++) {
                char ch = input1.charAt(i);
                if (Character.isUpperCase(ch)) {
                    char ch1 = Character.toLowerCase(input1.charAt(i));
                    sb.append(ch1);
                }
                if (Character.isLowerCase(ch)) {
                    char ch1 = Character.toUpperCase(input1.charAt(i));
                    sb.append(ch1);
                }
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1;
        int input2;
        input1 = sc.nextLine();
        input2 = sc.nextInt();

        togglStr obj = new togglStr();
        System.out.println(obj.result(input1, input2));
    }
}
