/*1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/
public class second {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            String str = "";
            for (int j = 0; j < n - i; j++) {
                str += '1';
            }
            for (int j = 0; j < i; j++) {
                str += i;
            }
            System.out.println(str);
        }
    }
}