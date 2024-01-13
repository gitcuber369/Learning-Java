import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 ,5 , 6, 7, 8, 9, 10};
        int[] arr_new = new int[10];

        System.out.println("Original Array : " + Arrays.toString(arr));

       for (int i = 0; i < arr.length; i++) {
         arr_new[i] = arr[i];
       }

        System.out.println("New Array : "  + Arrays.toString(arr_new));
    }
}
