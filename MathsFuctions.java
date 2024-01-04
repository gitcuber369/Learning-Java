import java.util.*;
public class MathsFuctions {
    private static int calculateSum(int a, int b, int c) {
        return a+b+c;
    }

    private static double calculateAverage(int sum, int count) {
        return (double) sum /count;
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 15;
        int num3 = 20;

        int sumResult = calculateSum(num1, num2, num3);

        double averageResult = calculateAverage(sumResult, 3);

        System.out.println("the sum of " + num1 + " , " + num2 + ", and " + num3 + " is: " + sumResult);
        System.out.println("The average is : " + averageResult);
        }
    }
