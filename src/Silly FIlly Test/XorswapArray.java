
public class XorswapArray {
    public static void main(String[] args) {
        int arr[] = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
        System.out.println(arr[0]);

    }

}
