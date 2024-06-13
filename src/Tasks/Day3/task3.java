package Tasks.Day3;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz..");
        int sayi = scanner.nextInt();

        int ilkSayi = 0;
        int ikinciSayi = 1;
        int toplam = ilkSayi + ikinciSayi;

        while ( ilkSayi <= sayi) {
            System.out.println(ilkSayi);
            ilkSayi = ikinciSayi;
            ikinciSayi = toplam;
            toplam = ilkSayi + ikinciSayi;
        }
    }
}
    /*
    3. Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini while döngüsü kullanarak yazdıran bir Java programı yazın.
     */