import java.util.HashMap;
import java.util.Map;

public class tempCodeRunnerFile {
    public static int func(String str) {
        Map<String, Integer> m = new HashMap<>();
        m.put("one", 1);
        m.put("two", 2);
        m.put("twenty", 20);

        String[] strs = str.split(" ");
        int x = 0;
        for(String s: strs) {
            x += m.get(s);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(func("twenty two"));
    }
}