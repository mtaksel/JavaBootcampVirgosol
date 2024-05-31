package Tasks.Day2;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz..");
        String cumle = scanner.nextLine();

        System.out.println("Kontrol edilecek kelimeyi giriniz..");
        String kontrol = scanner.nextLine();

        if (cumle.startsWith(kontrol)) {
            System.out.println("Cümle " + kontrol + " ile başlıyor" );
        } else {
            System.out.println("Cümle " + kontrol + " ile başlamıyor");
        }
    }
}
    /*
    11. Girilen bir cümlenin belirli bir kelime ile başlayıp başlamadığını kontrol eden bir program yazın.

	Örnek Girdi:
	Bir cümle giriniz: Java programlama dili
	Kontrol edilecek kelime: Java

	Örnek Çıktı:
	Cümle 'Java' ile başlıyor.
     */