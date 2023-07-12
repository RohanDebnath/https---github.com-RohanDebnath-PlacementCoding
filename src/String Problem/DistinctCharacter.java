import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCharacter {

    int result(String str) {
        Set<Character> count = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count.add(str.charAt(i));
            }
        }
        return count.size();
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your String");
        str = sc.nextLine();
        DistinctCharacter obj = new DistinctCharacter();
        System.out.println(obj.result(str));
    }
}
