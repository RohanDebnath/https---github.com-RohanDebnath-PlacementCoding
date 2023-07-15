
public class PasswordCheck {
    int result(String str, int n)
    {
        int num=0,capital=0,space=0;
      if(n>0)
      {
        if(Character.isDigit(str.charAt(0)))
        {
            return 0;
        }else
        {
            for(int i=1;i<n;i++)
            {
                if(Character.isUpperCase(str.charAt(i)))
                capital++;
                else if(Character.isDigit(str.charAt(i)))
                num++;
                else if(str.charAt(i)==' '|| str.charAt(i)=='/')
                space++;
                
            }
            if(capital>0 && num>0 && space==0)
            return 1;
            else
            return 0;
        }
      }else
      {
        return 0;
      }
    }
    public static void main(String[] args) {
        String password="a987 abC012";
        PasswordCheck obj= new PasswordCheck();
       System.out.println(obj.result(password,password.length()));
    }    
}
