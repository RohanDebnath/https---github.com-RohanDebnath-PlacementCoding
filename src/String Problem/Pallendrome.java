
public class Pallendrome {
    public static void main(String[] args) {
        String str = "Rohan";
        char charArray[] = str.toCharArray();
        int n = charArray.length;
        for (int i = 0; i < n / 2; i++) {
            charArray[i] = (char) (charArray[i] ^ charArray[n - i - 1]);
            charArray[n - i - 1] = (char) (charArray[i] ^ charArray[n - i - 1]);
            charArray[i] = (char) (charArray[i] ^ charArray[n - i - 1]);
        }
        String st = new String(charArray);
        System.out.println(st.equalsIgnoreCase(str));
    }

}
