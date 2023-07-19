/*
 Problem Statement –
Capgemini in its online written test have a coding question, wherein the students are given a string with multiple characters that are repeated consecutively.
You’re supposed to reduce the size of this string using mathematical logic given as in the example below :
Input :
aabbbbeeeeffggg
Output:
a2b4e4f2g3
Input :
abbccccc
Output:

ab2c5
*/
public class CharCount {
    String result(String str) {
        StringBuilder sb = new StringBuilder();
        char previousChar = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char cuurentChar = str.charAt(i);
            if (previousChar == cuurentChar) {
                count++;
            } else {
                sb.append(previousChar);
                if (count > 1) {
                    sb.append(count);
                }
                  count=1;
            previousChar=cuurentChar;
            }
        }
        sb.append(previousChar);
        if(count>1)
        sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabbbbeeeeffggg";
        CharCount obj = new CharCount();
       System.out.println( obj.result(str));
    }

}
