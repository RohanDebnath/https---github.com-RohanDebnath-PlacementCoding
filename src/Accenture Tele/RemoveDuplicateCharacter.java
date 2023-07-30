import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {
    String result(String str)
    {
        StringBuilder sb = new StringBuilder();
        HashSet <Character> set= new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(!set.contains(str.charAt(i)))
            {
                set.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        RemoveDuplicateCharacter obj = new RemoveDuplicateCharacter();
        System.out.println(obj.result(str));
    }
    
}
