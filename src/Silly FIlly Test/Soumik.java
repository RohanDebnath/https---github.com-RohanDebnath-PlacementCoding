class Soumik {
    static void print(int n) {
        if (n < 1)
            return;
        print(n - 1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        print(3);
        print(3);
    }
}
