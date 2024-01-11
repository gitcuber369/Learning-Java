public class Exception1 {
    public static void main(String[] args) {
        try {
            int result = divideNumber(10,0);
            System.out.println("Result : " + result);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    public static int divideNumber(int dividend, int divisior) {
        if (divisior == 0) {
            throw new ArithmeticException("Cannot divide the givin number by Zero!");
        }
        return dividend / divisior;
    }
}
