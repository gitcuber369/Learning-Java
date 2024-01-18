import java.util.Arrays;

public class stringDupicate {
    public static void main(String[] args) {
        String[] str = {"Arpit", "Atul", "Atul", "Rudransh", "Rudransh"};

        Arrays.sort(str);
        
        for (int i = 0; i < str.length; i++) {
            for (int j =  i + 1; j < str.length; j++) {
                if (str[i] == str[j] ) {
                System.out.println(str[j]);
                 }
            }
        }
    }
}