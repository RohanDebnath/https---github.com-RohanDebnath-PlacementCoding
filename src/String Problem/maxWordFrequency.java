public class maxWordFrequency {
    public static void main(String args[]) {
        String s = "I am the am thksa am Rohan";
        String arr[] = s.split(" ");
        String store = "", res = "";
        int k = 0, z = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            store = arr[i];
            for (int j = i; j < arr.length - 1; j++) {
                if (store.equalsIgnoreCase(arr[j + 1]))
                    k++;
                if (k > z) {
                    z = k;
                    res = store;
                }

            }
        }
        System.out.println(res);
    }
}
