package Lambda;

public interface SumCalculate {
    int sum(int a, int b);

    public static void main(String[] args) {
        SumCalculate sumCalculate = (x, y) -> x + y;
        int result = sumCalculate.sum(5, 10);
        System.out.println("Sum of 5, 10: " + result);
        result = sumCalculate.sum(15, -35);
        System.out.println("Sum 15, -35 ): " + result);
    }
}
