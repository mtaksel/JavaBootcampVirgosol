package Tasks.Day6;

public class task9 {

    public int sayi1 = 5;
    public int sayi2 = 10;

    public task9(int sayi2, int sayi1) {
        this.sayi2 = sayi2;
        this.sayi1 = sayi1;
    }

    public void sayiTopla(){
        int toplam = sayi1 + sayi2;
        System.out.println(toplam);
    }

    public static void main(String[] args) {

        task9 task9 = new task9(15,34);
        task9.sayiTopla();
    }

}
    /*
    9)Bir sınıf oluşturun ve bu sınıfta iki değişken tanımlayın. Bu değişkenlerin toplamını bir metod içinde hesaplayın ve ekrana yazdırın.
     */