import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        int[] arr1 = {1001, 1002, 1025, 2586, 1026, 7894, 2569, 102, 213}; 
        String[] arr2 = {
            "Java", 
            "C++", 
            "C", 
            "Hashell", 
            "Pyhton"
        };
        System.out.println("Original Array : " + Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println("Sorted Array : " + Arrays.toString(arr2));

        System.out.println("Original Array : " + Arrays.toString(arr2));

        Arrays.sort(arr2);

        System.out.println("Sorted String array : " + Arrays.toString(arr2));
    }
}
