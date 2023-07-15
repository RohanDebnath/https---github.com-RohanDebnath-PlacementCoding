
public class OperationChoice {
    int result(int a, int b, int c) {
        switch (c) {
            case 1:
                return (a + b);
            case 2:
                return (a - b);
            case 3:
                return (a * b);
            case 4:
                return (a / b);
        }
        return 0;
    }

    public static void main(String[] args) {
        OperationChoice obj= new OperationChoice();
        System.out.println(obj.result(12, 16, 1));
    }
}
