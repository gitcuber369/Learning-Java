public class Integer_Exe{
    public static void main(String[] args) {
        int a = 100;
        trynumber(a);
         a = 9; 
        trynumber(a);

    }

    public static void trynumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even");
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    public static void checkEvenNumber(int number){
        if (number %2 !=0)  {
            throw new IllegalArgumentException(number + " is odd");
        }
    }
}