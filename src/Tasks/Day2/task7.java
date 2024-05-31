package Tasks.Day2;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz..");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Girdiğiniz sayı : " + sayi + " pozitiftir" );
        } else if (sayi < 0) {
            System.out.println("Girdiğiniz sayı : " + sayi + " negatiftir");
        } else {
            System.out.println("Girdiğiniz sayı : Sıfırdır");
        }
    }
}
    /*
    7. Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının pozitif, negatif veya sıfır olduğunu belirten programı yazınız.

    Örnek Girdi:
    Bir tam sayı giriniz: 0

    Örnek Çıktı:
    Sayı sıfırdır
     */
