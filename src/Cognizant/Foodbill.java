/*
Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during 
break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 
Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!
*/
import java.util.Scanner;

public class Foodbill {
    int result(int pizza, int puff,int coldrink)
    {
        return ((pizza*100)+(puff*20)+(coldrink*10));
    }
    public static void main(String[] args) {
        Foodbill obj=new Foodbill();
      System.out.println(  obj.result(10, 12, 5));

    }    
}
