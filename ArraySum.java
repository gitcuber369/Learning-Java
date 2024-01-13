public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {12 ,52 ,52 ,86, 8798};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        System.out.println("Sum of the given array : " + sum);
    }
}
