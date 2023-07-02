import java.util.Scanner;

public class CharacterSumOrDigit {

    String findSolution(String input1, int input2) {
        String returnVal = "";
        int sum = 0;
        String alph = "";
        if (input1.length() == 0) {
            returnVal = "NULL";
            // System.out.println("NULL");
        } else {
            if (input2 == 0) {
                for (int i = 0; i < input1.length(); i++) {
                    char ch = input1.charAt(i);
                    if (Character.isDigit(ch)) {
                        sum += Character.getNumericValue(ch);
                        // System.out.println(sum);
                    }
                }
                if (sum == 0) {
                    // System.out.println("ZERO");
                    returnVal = "ZERO";
                } else {
                    returnVal = String.valueOf(sum);
                }

            } else if (input2 == 1) {
                for (int i = 0; i < input1.length(); i++) {
                    char ch = input1.charAt(i);
                    if (!Character.isDigit(ch)) {
                        alph += ch;
                    }
                }
                if (alph.length() != 0) {
                    returnVal = alph;
                    // System.out.println(alph);
                } else {
                    returnVal = "ZERO";
                    // System.out.println("ZERO");
                }

            }

        }

        return returnVal;
    }

    public static void main(String[] args) {
        int input2;
        String input1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input1 String");
        input1 = sc.nextLine();
        System.out.println("Enter either 0/1");
        input2 = sc.nextInt();

        CharacterSumOrDigit obj = new CharacterSumOrDigit();
        String ans = obj.findSolution(input1, input2);
        System.out.println(ans);
    }

}
