package Tasks.Day4;

public class task3 {

    public static void main(String[] args) {

        int[] list = {1,2,3,4,5};
        System.out.println(enBuyuk(list));
    }

    public static int enBuyuk(int[] list){
        int max = Integer.MIN_VALUE;
        for (int each : list){
            if (each > max){
                max = each;
            }
        }
        return max;
    }
}
    /*
    3) Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan bir metod yazın.
     */
