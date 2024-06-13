package Tasks.Day4;

public class task4 {

    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6};
        System.out.println(enKucuk(list));
    }

    public static int enKucuk(int[] list){

        int min = Integer.MAX_VALUE;

        for (int each : list){
            if (each < min){
                min = each;
            }
        }
        return min;
    }
}
    /*
    4) Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan bir metod yazın.
     */