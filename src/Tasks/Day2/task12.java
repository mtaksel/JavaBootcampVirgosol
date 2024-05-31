package Tasks.Day2;

import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir ay numarası giriniz..(1-12) : ");
        int ay = scanner.nextInt();

        switch (ay){
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimindesiniz");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Kış mevsimindesiniz");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar ayındasınız");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar ayındasınız");
                break;
            default:
                System.out.println("Geçersiz ay girdiniz.");
                break;
        }
    }
}
    /*
    12. Kullanıcıdan bir ay numarası girmesini isteyen ve bu ayın yaz mevsiminde olup olmadığını belirleyen programı yazınız.
    Not: Switch-case kullanarak yazınız.

	Örnek Girdi:
	Bir ay numarası giriniz (1-12): 7
	Örnek Çıktı:
	Yaz mevsimindesiniz.
     */