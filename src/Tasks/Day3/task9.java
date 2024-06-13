package Tasks.Day3;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sonuc = 0;

        while (true) {
        System.out.println("bir sayı giriniz..");
        int sayi = scanner.nextInt();
        sonuc = sayi + sonuc;
        if (sayi == 0 ) break;
        }
        System.out.println(sonuc);
    }
}
    /*
    9. Kullanıcıdan alınan sayılarla toplama işlemi yapan ve kullanıcı 0 girene kadar devam eden do-while döngüsü kullanan bir Java programı yazın.
     */