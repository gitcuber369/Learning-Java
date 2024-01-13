public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {110, 45 ,54, 78, 85, 96, 77};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;

        System.out.println("Average of number " + average);
    }
}
