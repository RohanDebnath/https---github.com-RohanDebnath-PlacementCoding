import java.util.HashMap;

public class EachOccurance {
    void solution(String str) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                sb.append(currentChar);
                result = sb.toString();
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < result.length(); i++) {
            int c = 0;
            for (int j = 0; j < str.length(); j++) {
                if (result.charAt(i) == str.charAt(j))
                    c++;
            }
            map.put(result.charAt(i), c);
        }

        System.out.println(map);

    }

    public static void main(String[] args) {
        String str = "RoRRhanDebnath";
        EachOccurance obj = new EachOccurance();
        obj.solution(str);

    }

}
