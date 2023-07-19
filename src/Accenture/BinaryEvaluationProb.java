/*Problem Description :
The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:
int OperationsBinaryString(char* str);
The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:
– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.
Note:
No order of priorities of operations is required
Length of str is odd
If str is NULL or None (in case of Python), return -1
Input:
str: 1C0C1C1A0B1
Output:
1
Explanation:
result of the expression becomes 1, hence 1 is returned.
Sample Input:
0C1A1B1C1C1B0A0
Output:0*/

import java.util.Scanner;

public class BinaryEvaluationProb {

    int result(String str)
    {
        if(str==null)
        return -1;
        else
        {
            int val= Character.getNumericValue(str.charAt(0));
            for(int i=1;i<str.length();i+=2)
            {
                if(str.charAt(i)=='A')
                {
                    val &= Character.getNumericValue(str.charAt(i+1));
                }
                else if(str.charAt(i)=='B')
                {
                    val |= Character.getNumericValue(str.charAt(i+1));
                }else if(str.charAt(i)=='C')
                {
                    val ^= Character.getNumericValue(str.charAt(i+1));
                }
            }
         return val;
        }
    }
    public static void main(String[] args) {
        String string = "1C0C1C1A0B1";
        BinaryEvaluationProb obj = new BinaryEvaluationProb();
        System.out.println(obj.result(string));

    }

}
