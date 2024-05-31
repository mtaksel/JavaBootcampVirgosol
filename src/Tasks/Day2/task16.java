package Tasks.Day2;

import java.util.Scanner;

public class task16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz..");
        String metin = scanner.nextLine();

        System.out.println(metin.replace("kötü","iyi").replace('.', '!'));

    }
}
    /*
    16. Ali, yazdığı romanın bazı bölümlerinde "kötü" kelimesini "iyi" ile ve '.' karakterini '!' karakteri ile değiştirmek istemektedir.
    Aşağıda verilen metin üzerinde bu değişiklikleri yapacak bir Java programı yazınız:
    Girdi metni: "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir."

   Örnek Girdi:
   Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.

   Örnek Çıktı:
   Bu iyi bir hikaye! Ancak, Ali'nin çabalarıyla daha iyi olabilir!
     */