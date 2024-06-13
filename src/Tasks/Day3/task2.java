package Tasks.Day3;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("faktoriyelini almak istediğiniz sayıyı yazınız..");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
            System.out.println( i + "! eşittir :" + faktoriyel );
        }
    }
}
    /*
    2. Bir sayının faktöriyelini for döngüsü kullanarak hesaplayan bir Java programı yazın. Örneğin, 5'in faktöriyeli 120'dir.
     */