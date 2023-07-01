/*
1 
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/

public class twelve {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num + n - j - 1;
            }
            System.out.println("");
        }

    }

}
