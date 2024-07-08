import java.util.Arrays;
import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {

        int[] myNumbers = new int[5];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("enter number " + (i + 1));
            myNumbers[i] = reader.nextInt();
        }
        Arrays.sort(myNumbers);
        for (int i= myNumbers.length-1;i>=0;i--){

            System.out.println(myNumbers[i]);
        }

    }
}
