package Tasks.Day2;

import java.util.Scanner;

public class task14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz..");
        String kelime = scanner.nextLine();

        System.out.println("İkinci kelimeyi giriniz..");
        String kelime2 = scanner.nextLine();

        if (kelime.equals(kelime2)) {
            System.out.println("Kelimeler eşit");
        } else {
            System.out.println("Kelimeler eşit değil");
        }
    }
}
    /*
    14. Kullanıcıdan iki kelime girmesini isteyen ve bu kelimelerin eşit olup olmadığını kontrol eden programı yazınız.

	Örnek Girdi:
	Birinci kelimeyi giriniz: Merhaba
	İkinci kelimeyi giriniz: Merhaba

	Örnek Çıktı:
	Kelimeler eşit.
     */