package Tasks.Day4;

public class task5 {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        System.out.println(diziToplam(list));
    }

    public static int diziToplam(int[] list){

        int toplam = 0;
        for(int each : list){
            toplam += each;
        }
        return toplam;
    }
}

    /*
    5) Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan bir metod yazın.
     */