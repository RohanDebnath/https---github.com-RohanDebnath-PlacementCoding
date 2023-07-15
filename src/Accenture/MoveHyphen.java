
public class MoveHyphen {
    String result(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '-') {
                sb.append(str.charAt(i));
                count++;
            }

        }
        while (count < str.length()) {
            sb.insert(0,'-');
            count++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "str.Move-Hyphens-to-Front";
        MoveHyphen obj = new MoveHyphen();
        System.out.println(obj.result(str));
    }
}
