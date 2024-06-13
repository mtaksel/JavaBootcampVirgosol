package Tasks.Day4;

public class task9 {

    public static void main(String[] args) {

        int[] list = {13,33,55,34,22,13,64,13};
        int deger = 13;
        int kacTane = elemanBul(list, deger);
        System.out.println("dızıde " + kacTane + " tane " + deger + " sayısı bulunmaktadır.");
    }

    public static int elemanBul(int[] list , int sayi){
        int sayac = 0;
        for (int each : list){
            if (each == sayi){
                sayac ++;
            }
        }
        return sayac;
    }
}

    /*
    9) Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan bir metod yazın.
     */
