package Tasks.Day4;


public class task2 {

    public static void main(String[] args) {

        int[] list = {1, 2, 3 ,4 };
        int[] terslist = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            terslist[terslist.length-1-i] = list[i];
        }
        for (int each : terslist) {
            System.out.println(each);
        }
    }
}

    /*
    2) Bir dizi oluşturun ve bu dizinin elemanlarını ters sırayla ekrana yazdırın.
     */