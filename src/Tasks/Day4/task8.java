package Tasks.Day4;

import java.util.Arrays;
import java.util.Collections;

public class task8 {

    public static void main(String[] args) {

        Integer[] list = {44, 53, 12, 66, 53, 772};
        buyuktenKucuge(list);
        System.out.println(Arrays.toString(list));
    }

    public static void buyuktenKucuge(Integer[] dizi) {

        Arrays.sort(dizi, Collections.reverseOrder());
    }
}
    /*
    8) Bir dizinin elemanlarını büyükten küçüğe sıralayan bir metod yazın.
     */
