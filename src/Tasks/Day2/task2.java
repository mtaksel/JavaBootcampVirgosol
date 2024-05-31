package Tasks.Day2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Br kelime giriniz..");
        String kelime = scanner.nextLine();

        System.out.println("Kelimenin uzunlugu : " + kelime.length() + " karakter");

    }
}
    /*
    2. Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

      Örnek Girdi:
      Bir kelime giriniz: merhaba
      Örnek Çıktı:
      Kelimenin uzunluğu: 7
     */
