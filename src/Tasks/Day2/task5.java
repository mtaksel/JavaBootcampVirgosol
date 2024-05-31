package Tasks.Day2;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ders notunuzu giriniz..");
        int not = scanner.nextInt();

        if (not >= 90) {
            System.out.println("Notunuz A");
        } else if (not >=80) {
            System.out.println("Notunuz B");
        } else if (not >=70) {
            System.out.println("Notunuz C");
        } else if (not >=60) {
            System.out.println("Notunuz D");
        } else {
            System.out.println("Notunuz F");
        }
    }
}
    /*
    5. Bir üniversite, öğrencilerin aldığı derslere göre notlarını harf notuna çeviren bir Java programı yazmanızı istemektedir.
    Program, her bir öğrencinin notunu okuyacak ve aşağıdaki kurallara göre harf notunu belirleyecektir:
	90-100: A
	80-89: B
	70-79: C
	60-69: D
	0-59: F

	Örnek Girdi:
	Bir puan giriniz: 85

	Örnek Çıktı:
	Not: B
     */
