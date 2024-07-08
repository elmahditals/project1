import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        int age;
        System.out.println("enter your name ");
name = reader.nextLine();
        System.out.println("enter your age ");
        age = reader.nextInt();

        if (age < 10 ) {
            System.out.println("age incorrect ");

        } else if (age>10 && age<30) {
            System.out.println("jeune");
        } else if (age>30 && age <50) {
            System.out.println("moyen");
        }else {
            System.out.println("vieux");
        }
        int s=0;
for (int i=1; i<=age; i++) {
    s=s+i;

}

    }
}
