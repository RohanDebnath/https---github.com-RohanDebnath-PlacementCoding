
public class Bamby {
    public static void main(String[] args) {
        String str="Ayantika";
        String str2="Ayantika";
        String s1= new String("Rohan");
        String s2= new String("Rohan");

        System.out.println(str==str2);                 
        System.out.println(s2==s1);                   
        System.out.println(str.equals(str2));        
        System.out.println(s1.equals(s2));        

        StringBuffer sb = new StringBuffer("A");
        StringBuffer sb2 = new StringBuffer("A");

        System.out.println(sb==sb2); 
        System.out.println(sb.equals(sb2));

        StringBuilder sb3 = new StringBuilder("B");
        StringBuilder sb4 = new StringBuilder("B");
        System.out.println(sb3==sb4);
        System.out.println(sb3.equals(sb4));

    }
    
}
