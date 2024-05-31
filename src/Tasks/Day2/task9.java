package Tasks.Day2;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {

        String metin = "abc";

        char ilkHarf = metin.charAt(0);
        int ilkHarfASCII = (int) ilkHarf;

        char ikinciHarf = metin.charAt(1);
        int ikinciHarfASCII = (int) ikinciHarf;

        char ucuncuHarf = metin.charAt(2);
        int ucuncuHarfASCII = (int) ucuncuHarf;

        System.out.println("Karakter: " + ilkHarf + ", ASCII Değeri: " + ilkHarfASCII);
        System.out.println("Karakter: " + ikinciHarf + ", ASCII Değeri: " + ikinciHarfASCII);
        System.out.println("Karakter: " + ucuncuHarf + ", ASCII Değeri: " + ucuncuHarfASCII);
    }
}
    /*
    9.  'abc' metinindeki ASCII değerlerini ekrana yazdıran programı yazınız.

    Örnek Çıktı:
	Karakter: a, ASCII Değeri: 97
	Karakter: b, ASCII Değeri: 98
	Karakter: c, ASCII Değeri: 99
     */
