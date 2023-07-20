/*
 Problem Statement –
IIHM institution is offering a variety of courses to students. Students have a facility to check whether a particular course is available in the institution. Write a program to help the institution accomplish this task. 
If the number is less than or equal to zero display “Invalid Range”.
Assume maximum number of courses is 20.
Sample Input 1:
Enter no of course:
5
Enter course names:
Java
Oracle
C++
Mysql
Dotnet
Enter the course to be searched:
C++
Sample Output 1:
C++ course is available
Sample Input 2: 
Enter no of course:
3
Enter course names:
Java
Oracle
Dotnet
Enter the course to be searched:
C++
Sample Output 2:
C++ course is not available
*/
import java.util.Scanner;
public class Course {
    String result(String arr[], String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search))
                return "Available";
        }
        return "NO";
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        String search = sc.nextLine();
        Course obj = new Course();
        System.out.println(obj.result(arr, search));

    }

}
