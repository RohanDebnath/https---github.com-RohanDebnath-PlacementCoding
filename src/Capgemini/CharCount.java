
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
