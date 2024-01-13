import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 2 ,5 ,7 };
        
        System.out.println("Origianl Array : " + Arrays.toString(arr));

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("Duplicate Found " + arr[i]);
            }
        }
    }
}
