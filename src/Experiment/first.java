public class first {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 1, 4, 5, 6, 5, 5, 1, 5 };
        int[] topTwoFrequentNumbers = findTopTwoFrequentNumbers(array);

        System.out.println(
                "Top two most frequent numbers: " + topTwoFrequentNumbers[0] + ", " + topTwoFrequentNumbers[1]);
    }

    public static int[] findTopTwoFrequentNumbers(int[] array) {
        int n = array.length;
        int firstNumber = 0, secondNumber = 0;
        int firstCount = 0, secondCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (array[j] == array[i])
                    count++;
            }

            if (count > firstCount) {
                secondCount = firstCount;
                secondNumber = firstNumber;
                firstCount = count;
                firstNumber = array[i];
            } else if (count > secondCount && count < firstCount) {
                secondCount = count;
                secondNumber = array[i];
            }
        }

        int[] topTwoFrequentNumbers = { firstNumber, secondNumber };
        return topTwoFrequentNumbers;
    }
}
