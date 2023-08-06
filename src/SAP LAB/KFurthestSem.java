import java.util.*;

public class KFurthestSem {
    int result(int k, int arr[],int x)
    {
        HashMap<Integer, Integer> diffElementMap = new HashMap<>();

         for (int i = 0; i < arr.length; i++) {
            int absDiff = Math.abs(arr[i] - x);
            diffElementMap.put(absDiff, arr[i]);
        }
        List<Integer> sortedDiffList = new ArrayList<>(diffElementMap.keySet());
        Collections.sort(sortedDiffList, Collections.reverseOrder());
        int sum=0;
        for (int i = 0; i < k; i++) {
            int absDiff = sortedDiffList.get(i);
            sum += diffElementMap.get(absDiff);
        }
       
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the number of Kth element");
        int k=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter your array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        KFurthestSem obj = new KFurthestSem();
        System.out.println("Enter sesrch value");
        int x=sc.nextInt();
        System.out.println(obj.result(k, arr,x));
    }    
}
