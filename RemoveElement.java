import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index you want to remove ");
        int[] arr = { 1 , 2 , 3 , 4, 5, 6, 7, 8, 9, 10};
        
        int len = arr.length;
        int[] arr_new = new int[len-1];
        
        int n = sc.nextInt();
        for (int i = 0, k = 0; i < len; i++) {
            if (arr[i] != n ) {
                arr_new[k] = arr[i];
                k++;
            }
        }
        System.out.println("Before Deletion :" + Arrays.toString(arr));
        System.out.println("After Deletion :" + Arrays.toString(arr_new));
        
        }
    }
