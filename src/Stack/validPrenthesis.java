import java.util.*;
public class validPrenthesis {
    static boolean result(String str)
    {
        Stack<Character> st= new Stack<>();
        char arr[]=str.toCharArray();
        for(char c:arr)
        {
            if(c=='('||c=='{'||c=='[')
            st.push(c);
            else
            {
                char top=st.peek();
                if((c==')'&& top=='(')||(c=='}'&& top=='{') || (c==']'&&top=='['))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }

            }
        }
        return st.isEmpty();
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(result(str));
}    
}
