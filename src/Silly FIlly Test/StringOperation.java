public class StringOperation {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        System.out.println(sb);
        sb.insert(1,"b");
        System.out.println(sb);
        sb.insert(2, "c");
        System.out.println(sb);
        sb.insert(7, "D");
        System.out.println(sb);
    }
}
