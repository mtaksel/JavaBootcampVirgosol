package Tasks.Day2;

import java.util.Scanner;

public class task18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gezegen adı giriniz..");
        String gezegen = scanner.nextLine();

        switch (gezegen){
            case "Merkür":
            case "Venüs":
            case "Dünya":
            case "Mars":
                System.out.println("İç gezegen");
                break;
            case "Jüpiter":
            case "Satürn":
            case "Uranüs":
            case "Neptün":
                System.out.println("Dış gezegenler");
                break;
            default:
                System.out.println("Geçerli bir gezegen adı giriniz");
        }
    }
}
    /*
    18. Bir Astronom, gezegenleri sınıflandırmak için bir program geliştirmek istiyor.
    Kullanıcıdan girilen gezegen adıyla gezegenin iç gezegen mi yoksa dış gezegen mi olduğunu belirlemesi gerekiyor.
    Astronomun bu programı yazmasına yardımcı olun.

	Not1: İÇ GEZEGENLER --> Merkür, Venüs, Dünya ve Mars.
		  DIŞ GEZEGENLER --> Jüpiter, Satürn, Uranüs ve Neptün
	Not2: Switch-case kullanarak yazınız.

    Örnek Girdi:
    Bir gezegen adı giriniz: Dünya

    Örnek Çıktı:
    İç gezegen
     */