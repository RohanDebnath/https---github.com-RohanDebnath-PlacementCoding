
public class ReturnVsExit {

    int result(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                //return 0;
                 System.exit(0);
            }
            System.out.println("Hello");
        }
        System.out.println("Hi");
        return str.length();
    }

    public static void main(String[] args) {
        String str = "ROh3e34an";
        int len = str.length();
        ReturnVsExit obj = new ReturnVsExit();
        System.out.println(obj.result(str));
    }

}
