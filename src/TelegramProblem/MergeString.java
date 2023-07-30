import java.util.Scanner;

public class MergeString {
    String result(String str1,String str2)
    {
       char arr[]= new char[str1.length()+str2.length()];
       int j=0; 
       int k=str1.length()+str2.length()-1;
       for(int i=0;i<Math.min(str1.length(), str2.length());i++)
        {
            if(str1.charAt(i)<str2.charAt(i))
            {
                arr[j]=str1.charAt(i);
                arr[k]=str2.charAt(i);
            }else
            {
                arr[k]=str1.charAt(i);
                arr[j]=str2.charAt(i);
            }
            ++j;
            --k;
        }
        if(str1.length()<str2.length())
        {
          //  System.out.println("Inside IF");
            while(j<str2.length())
            {
               // System.out.print("Inside while1");
                arr[j]=str2.charAt(j);
                j++;
            }
        }else
        {
            while(j<str1.length())
            {
                //  System.out.println("Inside while2");
                arr[j]=str1.charAt(j);
                j++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char var : arr)
        {
            sb.append(var);
        }
    return sb.toString();
      
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    MergeString obj = new MergeString();
   System.out.println( obj.result(str1, str2));
}    
}
