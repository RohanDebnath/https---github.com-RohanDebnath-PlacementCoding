/*
 Problem Statement –
You have write a function that accepts, a string which length is “len”, the string has some “#”, in it you have to move all 
the hashes to the front of the string and return the whole string back and print it.
char* moveHash(char str[],int n);
example :-
Sample Test Case
Input:
Move#Hash#to#Front
Output:
###MoveHashtoFront
*/
public class HashtoFront {
    String result(String str) {
        StringBuilder sb = new StringBuilder();
        char chararray[] = new char[str.length()];
        int k = str.length() - 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != '#') {
                chararray[k] = str.charAt(i);
                k--;
            }
        }
        while (k >= 0) {
            chararray[k] = '#';
            k--;
        }
        return new String(chararray);
    }

    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        HashtoFront obj = new HashtoFront();
        System.out.println(obj.result(str));
    }
}
