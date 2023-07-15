import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LargeSmallSum {
    int result(int []arr)
    {
        int sum=0;
        if(arr.length==0 || arr.length<=3)
        return 0;
        else
        {
            ArrayList<Integer> odd=new ArrayList<Integer>();
            ArrayList<Integer> even=new ArrayList<Integer>();
            even.add(arr[0]);
            for(int i=1;i<arr.length;i++)
            {
                if(i%2==0)
                {
                    even.add(arr[i]);
                }else
                odd.add(arr[i]);
            }
            Collections.sort(odd);
            Collections.sort(even);
            int evenpos2ndLargest= even.get(even.size()-2);
            int odd2ndSmallest= odd.get(1);
            sum=evenpos2ndLargest+odd2ndSmallest;


        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,7,5,4};
        LargeSmallSum obj = new LargeSmallSum();
      System.out.println(obj.result(arr));
    }    
}
