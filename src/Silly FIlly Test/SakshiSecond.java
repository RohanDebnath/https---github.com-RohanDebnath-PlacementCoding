import java.util.*;

public class SakshiSecond {
    public static int[] freqSort(int[] listEle) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : listEle) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
    
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        int[] result = new int[listEle.length];
        int index = 0;
        
        for (Map.Entry<Integer, Integer> entry : entries) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            
            for (int i = 0; i < frequency; i++) {
                result[index++] = number;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 8, 9, 10};
        int[] sortedArray = freqSort(input);

        System.out.println(Arrays.toString(sortedArray));
    }
}
