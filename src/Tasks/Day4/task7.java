package Tasks.Day4;

import java.util.Arrays;

public class task7 {

    public static void main(String[] args) {

        int[] list = {11, 88, 38, 15, 733, 55};
        kucukBuyuge(list);
        System.out.println(Arrays.toString(list));
    }

    public static void kucukBuyuge(int[] dizi) {
        Arrays.sort(dizi);
    }
}
    /*
    7) Bir dizinin elemanlarını küçükten büyüğe sıralayan bir metod yazın.
     */
