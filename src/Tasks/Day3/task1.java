package Tasks.Day3;

import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir mesaj giriniz..");
        String mesaj = scanner.nextLine();

        for (int i = 0; i <10 ; i++) {
            System.out.println(mesaj);
        }
    }
}
    /*
    1. Bir mesajı 10 kez ekrana yazdıran bir Java programı yazın.
     */