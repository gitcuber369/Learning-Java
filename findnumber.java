public class findnumber {
    public static boolean contains(int[] arr, int item){
        for(int n : arr){
            if (item == n ) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {
            1808, 2002, 2003, 4587, 2058, 2365, 4578, 
            1005, 1023, 1024, 1023, 1254, 1548, 8756,
        };
        System.out.println(contains(arr1, 1023));
        System.out.println(contains(arr1, 8000));
    }
}
