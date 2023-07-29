import java.util.Scanner;

public class HistoryDocument {
    int result(String str) {
        int count = 0;
        String countyear = "";
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i].length() > 2 && arr[i].charAt(2) == '-') {
                String arr2[] = arr[i].split("-");
                if (arr2[2] != countyear) {
                    countyear = arr2[2];
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HistoryDocument obj = new HistoryDocument();
        System.out.println(obj.result(str));
    }
}
