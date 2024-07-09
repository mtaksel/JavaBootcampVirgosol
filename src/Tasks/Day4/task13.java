package Tasks.Day4;

import java.util.ArrayList;
import java.util.List;

public class task13 {
    
    // Metod: Bir dizideki çift sayıları bulan ve bunları başka bir listeye ekleyen metod
    public static List<Integer> findEvenNumbers(int[] numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) { // Sayının çift olup olmadığını kontrol et
                evenNumbers.add(number); // Çift ise listeye ekle
            }
        }

        return evenNumbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Örnek dizi
        List<Integer> evenNumbers = findEvenNumbers(numbers);

        System.out.println("Çift sayılar: " + evenNumbers);
    }
}

