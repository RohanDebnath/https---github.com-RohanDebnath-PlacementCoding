/*Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels*/

import java.util.Scanner;

public class CarWheel {
    static void result(int v, int w)
    {
        int temp_wheel=w-v*2;
        temp_wheel/=2;
        int tw=v-temp_wheel;
        System.out.println("TW= "+tw);
        System.out.println("FW= "+temp_wheel);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v=sc.nextInt();   
        int w=sc.nextInt();  
        result(v, w);
    }
    
}
