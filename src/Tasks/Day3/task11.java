package Tasks.Day3;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin = scanner.nextLine();
        String sonuc = "";

        for (int i = 0; i < metin.length(); i++) {
            char ch = metin.charAt(i);

            if (sonuc.indexOf(ch)==-1){
                sonuc = sonuc + ch;
            }
        }
        System.out.println(sonuc);
    }
}
    /*
    11. For döngüsü kullanarak bir String ifadede tekrar eden karakterleri bulan bir Java programı yazın.
     */
