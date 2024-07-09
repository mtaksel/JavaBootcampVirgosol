package Tasks.Day6;

public class task6 {

    public void yasHesapla(int yas1, int yas2){
        int yasToplam = yas1 + yas2;
        System.out.println(yasToplam);
    }

    public void yasHesapla(int yas1,int yas2, int yas3){
        int yasToplam = yas1 + yas2 + yas3;
        System.out.println(yasToplam);
    }

    public static void main(String[] args) {
        task6 task6 = new task6();

        task6.yasHesapla(15,19);
        task6.yasHesapla(15,19,21);
    }
}

/* 6)Bir sınıf oluşturun ve bu sınıfta iki farklı metot tanımlayın. Bu metotlar aynı isme sahip olsun ama farklı parametreler alsın (overloading).
 */