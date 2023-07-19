public class freq {
    static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char prevChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
                prevChar = currentChar;
            }
        }

        // Append the last character and its count if applicable
        compressed.append(prevChar);
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input1 = "aabbbbeeeeffggg";
        String input2 = "abbccccc";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + compressString(input1));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + compressString(input2));
    }
}
