public class findIndex {
    public static int finfIndex(int[] arr, int n){
        if(arr == null)
            return -1;

            int len = arr.length;
            int i = 0;

         while (i < len) {
            if (arr[i] == n) 
                return i;
            else
                i = i + 1 ;
            
         }
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {25, 45, 85 ,78 ,78 ,65 ,52 ,456};

        System.out.println("Index value of 78 :" + finfIndex(arr, 78));
        System.out.println("Index value of 795 :" + finfIndex(arr, 795));
    }
}
