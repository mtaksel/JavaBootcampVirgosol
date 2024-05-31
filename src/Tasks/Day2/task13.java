package Tasks.Day2;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz...");
        String metin = scanner.nextLine();

        System.out.println("Karakter giriniz...");
        String karakter = scanner.nextLine();

        System.out.println("Karakter : '" + karakter + "' " + metin.indexOf(karakter) + ". pozisyonda bulunuyor");
    }
}
    /*
    13. Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin pozisyonunu bulan bir program yazınız.

	Örnek Girdi:
	Bir metin giriniz: Merhaba Dünya
	Aranacak karakter: a

	Örnek Çıktı:
	Karakter 'a' 4. pozisyonda bulunuyor.
     */