package Practice.day2;

import java.util.Scanner;

public class ScannerClassPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı girin...");

        int sayi = scanner.nextInt();

        System.out.println("girdiğiniz sayı : " + sayi);

        String str = scanner.nextLine();

        System.out.println(str);

    }
}
