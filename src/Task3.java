import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:");

        System.out.print("Enter coefficient a: ");
        int a = scanner.nextInt();

        System.out.print("Enter coefficient b: ");
        int b = scanner.nextInt();

        System.out.print("Enter coefficient c: ");
        int c = scanner.nextInt();


        int delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Delta negative.");
            System.exit(0); // Exit the program if discriminant is negative
        }

        double x1 = (-b - Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Root 1: " + x1);
        System.out.println("Root 2: " + x2);

        scanner.close();
    }
}
