package Tasks.Day2;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz..");
        int sayi = scanner.nextInt();

        System.out.println("İkinci sayı giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("iki sayının çarpımı : " + sayi*sayi2);
    }
}
    /*
    3. Kullanıcıdan iki tam sayı girmesini isteyen ve bu sayıların çarpımını ekrana yazdıran programı yazınız.

     Örnek Girdi:
     İlk sayıyı giriniz: 4
     İkinci sayıyı giriniz: 5

     Örnek Çıktı:
     Sayıların çarpımı: 20
     */