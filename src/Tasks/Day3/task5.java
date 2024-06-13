package Tasks.Day3;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir mesaj giriniz..");
        String metin = scanner.nextLine();

        int tekrar = 1;

        while (tekrar <= 5){
            System.out.println(metin + " " + tekrar + " kere yazıldı");
            tekrar++;
        }
    }
}

    /*
    Bir mesajı do-while döngüsü kullanarak ekrana 5 kez yazdıran bir Java programı yazın.
     */
