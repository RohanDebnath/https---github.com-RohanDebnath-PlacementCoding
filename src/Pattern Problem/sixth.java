/*
7
76
765
7654
76543
765432
7654321*/
public class sixth {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i <= 7; i++) {
            int k = 7;
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k--;
            }
            System.out.println("");
        }
    }

}
