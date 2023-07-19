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
