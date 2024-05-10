import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE MATHS MARKS");
        int Maths = sc.nextInt();

        System.out.println("ENTER THE Chemisty MARKS");
        int Chemistry = sc.nextInt();

        System.out.println("ENTER THE Physics MARKS");
        int Physics = sc.nextInt();

        System.out.println("ENTER THE English MARKS");
        int English = sc.nextInt();

        System.out.println("ENTER THE Biology MARKS");
        int Biology = sc.nextInt();

        float percentage = ((Maths + Chemistry + Physics + English + Biology) / 500.0f) * 100;

        System.out.println("Total Percentage of the student is : " + percentage);
    }
}
