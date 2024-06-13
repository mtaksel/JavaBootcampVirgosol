package Practice.day3;

public class WhilePractice2 {

    public static void main(String[] args) {

        int sayi = 1;
        int sonuc = 0;
        while (sayi <= 5) {
            sonuc = sonuc + sayi;
            sayi++;
            System.out.println(sonuc);
        }
    }
}
