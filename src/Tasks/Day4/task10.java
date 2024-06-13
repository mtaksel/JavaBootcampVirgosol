package Tasks.Day4;

public class task10 {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9, 11};
        int deger = 5;
        int index = degerAra(array, deger);

        if (index != -1) {
            System.out.println("Deger " + deger + "'nin bulundugu index: " + index);
        } else {
            System.out.println("Deger " + deger + " dizide bulunamadi");
        }
    }
    public static int degerAra(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
    /*
    10) Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren bir metod yazın.
     */
