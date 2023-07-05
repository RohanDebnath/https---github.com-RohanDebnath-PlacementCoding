import java.util.Scanner;

public class StringAlphabet {

    void result(String inpuString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inpuString.length(); i += 3) {
            for (int j = i; j < i + 1; j++) {
                if (inpuString.charAt(j) == inpuString.charAt(j + 1)) {
                    sb.append(Character.toUpperCase(inpuString.charAt(i)));
                } else {
                    char ch1 = Character.toUpperCase(inpuString.charAt(j));
                    char ch2 = Character.toUpperCase(inpuString.charAt(j + 1));
                    int ans = (int) ch1 - ch2;
                    ans = Math.abs(ans);
                    int a = 'A';
                    char ch = (char) (a + ans - 1);
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        String str;
        System.out.println("Enter your String");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        StringAlphabet obj = new StringAlphabet();
        obj.result(str);

    }
}
