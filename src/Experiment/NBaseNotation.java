public class NBaseNotation {
    public static String DecToNBase(int n, int num) {
        if (n <= 1 || n > 36) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int remainder = num % n;
            char symbol = getSymbol(remainder);
            result.insert(0, symbol);
            num = num / n;
        }

        return result.toString();
    }
    private static char getSymbol(int value) {
        if (value >= 0 && value <= 9) {
            return (char) ('0' + value);
        } else if (value >= 10 && value <= 35) {
            return (char) ('A' + (value - 10));
        } else {
            return ' ';
        }
    }
    public static void main(String[] args) {
        int n = 12;
        int num = 718;
        String result = DecToNBase(n, num);
        System.out.println(result);
    }
}
