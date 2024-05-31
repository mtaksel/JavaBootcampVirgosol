package Practice.day2;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayi girin..");
        int sayi1 = scanner.nextInt();

        System.out.println("ikinci sayi daha girin");
        int sayi2 = scanner.nextInt();

        System.out.println("yapmak istediginiz işlemi girin : * / - +");
        scanner.nextLine();
        String islem = scanner.nextLine();

        switch (islem) {
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;
            case "+":
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            default:
                System.out.println("hatalı değer girdiniz");
        }

        scanner.close();


    }
}
