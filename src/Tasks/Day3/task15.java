package Tasks.Day3;

import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();
        scanner.close();

        boolean isPalindrome = true;
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(word + " palindromik bir kelimedir.");
        } else {
            System.out.println(word + " palindromik bir kelime değildir.");
        }
    }
}
    /*
    15. Verilen bir string kelimenin  palindromik olup olmadığını bulan bir Java programı yazın.
    Palindromik ileri ve geri okunduğunda aynı olan kelimedir. (Örnek:  kayak)
     */
