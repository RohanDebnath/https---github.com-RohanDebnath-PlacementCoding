public class first {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                sb.append(currentChar);
                result = sb.toString();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        String result = removeDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("String without duplicates: " + result);
    }
}
