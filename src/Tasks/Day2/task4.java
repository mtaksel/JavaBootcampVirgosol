package Tasks.Day2;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenar uzunluğu giriniz..");
        int sayi = scanner.nextInt();

        System.out.println("İkinci kenar uzunluğu giriniz..");
        int sayi2 = scanner.nextInt();

        System.out.println("Üçüncü kenar uzunluğu giriniz..");
        int sayi3 = scanner.nextInt();

        if (sayi == sayi2 && sayi == sayi3){
            System.out.println("Bu üçgen eşkenar üçgendir");
        } else {
            System.out.println("Bu bir eşkenar üçgen değildir");
        }

    }
}
    /*
    4. Kullanıcıdan bir üçgenin kenar uzunluklarını girmesini isteyen ve bu üçgenin eşkenar olup olmadığını belirleyen programı yazınız.

    Örnek Girdi:
    Birinci kenar uzunluğunu giriniz: 5
    İkinci kenar uzunluğunu giriniz: 5
    Üçüncü kenar uzunluğunu giriniz: 5

    Örnek Çıktı:
    Bu üçgen eşkenar üçgendir
     */
