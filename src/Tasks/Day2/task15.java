package Tasks.Day2;

import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int yil = scanner.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 != 0 || yil % 400 == 0) {
                System.out.println(yil + " bir artık yıldır.");
            } else {
                System.out.println(yil + " bir artık yıl değildir.");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
    /*
    15. Girilen bir yılın artık yıl olup olmadığını belirleyen bir Java programı yazınız. Programınızın çıktısı,
    yılın artık yıl olup olmadığını doğru bir şekilde göstermelidir.

   Örnek Girdi:
   Bir yıl giriniz: 2020

   Örnek Çıktı:
   2020 bir artık yıldır.
     */
