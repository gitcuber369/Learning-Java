import java.util.Arrays;

public class Find_Common {
    public static void main(String[] args) {
        int[] arr1 = {1, 2 ,3, 4, 5 , 6, 7, 8, 9, 10};
        int[] arr2 = {10, 9, 8, 7, 5, 6, 4, 3, 2, 2, };

        System.out.println("Ist Array" + Arrays.toString(arr1));
        System.out.println("2nd Array" + Arrays.toString(arr2));

        for(int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println();
                } else {
                    System.out.println("No duplicate");
                }
            }
        }
    }   
}
