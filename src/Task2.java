import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti valoarea kilogramelor: ");
        float greutate = scanner.nextFloat();

        System.out.print("Introduceti valoarea inaltimii in centimetrii: ");
        int inaltime = scanner.nextInt();
        float inaltimeaInMetrii = inaltime / 100.0f;

        float bmi = greutate / (inaltime * inaltimeaInMetrii);

        if (bmi >= 18.5 & bmi <= 24.9) {
            System.out.println("BMI optimal");
        }else {
            System.out.println("BMI not optimal");
        }
        scanner.close();

    }
}
