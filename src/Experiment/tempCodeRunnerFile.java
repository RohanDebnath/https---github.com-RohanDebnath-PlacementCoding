public class tempCodeRunnerFile {
    public static boolean isAutobiographical(int number) {
        String numString = String.valueOf(number);
        int[] frequency = new int[numString.length()];

        // Count the frequency of each digit in the number
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            if (digit < frequency.length) {
                frequency[digit]++;
            }
        }

        // Check if the frequency matches the digits
        for (int i = 0; i < frequency.length; i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            if (digit != frequency[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        long  number = 6210001000;
        boolean isAutobiographical = isAutobiographical(number);
        System.out.println(number + " is autobiographical? " + isAutobiographical);
    }
}
