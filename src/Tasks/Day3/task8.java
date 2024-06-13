package Tasks.Day3;

import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Basamakların toplamı: " + sum);
    }
}
    /*
    8. Bir sayının basamaklarını toplayan ve while döngüsü kullanan bir Java programı yazın.
     */
