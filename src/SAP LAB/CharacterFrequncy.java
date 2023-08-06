import java.util.Scanner;

public class CharacterFrequncy {
    String result(String str) {
        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length() ; i++) {
            char cuurentChar = str.charAt(i);
            if (prevChar == cuurentChar) {
                count++;
            } else {
                sb.append(prevChar);
                if (count > 1)
                sb.append(count);
                prevChar = cuurentChar;
                count=1;
            }
           
        }
        sb.append(prevChar);
        if (count > 1)
        sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String str = sc.nextLine();
        CharacterFrequncy obj = new CharacterFrequncy();
        System.out.println(obj.result("aabbbbeeeeffgggbb"));
    }
}
