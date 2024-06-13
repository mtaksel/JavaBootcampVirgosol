package Tasks.Day4;

public class task6 {

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        System.out.println(ortalama(list));
    }

    public static int ortalama(int[] list){
        int toplam = 0;
        for(int each : list){
            toplam += each;
        }
            return toplam / list.length;
    }
}
    /*
    6) Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan bir metod yazın.
     */
