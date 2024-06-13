package Tasks.Day4;

public class task11 {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        int[] kopyaList = kopyaListe(list);

        System.out.println("Ilk dizi: ");
        printDizi(list);
        System.out.println("Kopyya dizi: ");
        printDizi(kopyaList);
    }

    public static int[] kopyaListe(int[] dizi) {
        int[] yeniDizi = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            yeniDizi[i] = dizi[i];
        }
        return yeniDizi;
    }

    public static void printDizi(int[] dizi) {
        for (int each : dizi) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
}
    /*
    11) Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.
     */
