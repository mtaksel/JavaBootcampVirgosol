package Tasks.Day2;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz..");
        String cumle = scanner.nextLine();

        if (cumle.length() <= 50 ){
            System.out.println("Cümle uzunluğu 50'den kısa bir cümle");
        } else {
            System.out.println("Cümle uzunluğu 50'den uzun bir cümle");
        }
    }
}
    /*
    6. Kullanıcıdan bir cümle girmesini isteyen ve eğer cümlenin uzunluğu 50'den küçükse "Kısa bir cümle" mesajını yazdıran programı yazınız.

    Örnek Girdi:
    Bir cümle giriniz: Merhaba, nasılsınız?

    Örnek Çıktı:
    Kısa bir cümle
     */