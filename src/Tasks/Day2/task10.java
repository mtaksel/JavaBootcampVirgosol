package Tasks.Day2;

import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci cümleyi giriniz..");
        String cumle = scanner.nextLine();

        System.out.println("İkinci cümleyi giriniz..");
        String cumle1 = scanner.nextLine();

        if (cumle.length() > cumle1.length()) {
            System.out.println("Uzun olan cümle: " + cumle);
        } else {
            System.out.println("Uzun olan cümle: " + cumle1);
        }
    }
}
    /*
    10. Girilen iki cümleden uzun olanı bulan bir program yazın.

	Örnek Girdi:
	Birinci cümleyi giriniz: Merhaba Dünya
	İkinci cümleyi giriniz: Java programlama dili

	Örnek Çıktı:
	Uzun olan cümle: Java programlama dili
     */
