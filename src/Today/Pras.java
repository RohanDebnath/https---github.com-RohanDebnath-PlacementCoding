

public class Pras {
    public static int func(int n) {
		int res = n;
		while (n >= 10) {
			res = 0;
			while (n != 0) {
				res += Math.pow(n % 10, 2);
				n /= 10;
			}
			n = res;
		}
		return res;
	}
    public static void main(String[] args) {
        System.out.println(func(100));
    }
}
