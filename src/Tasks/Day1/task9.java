package Tasks.Day1;

public class task9 {

    public static void main(String[] args){

    double aliUrunFiyati = 123.456;
    int tamSayiFiyat = (int) aliUrunFiyati;
    long veliTumBirikim = 10000L;
    int tamSayiTumbirikim = (int)veliTumBirikim;
    int toplamFiyat = tamSayiFiyat + tamSayiTumbirikim;

    System.out.println("Alinin ürün fiyatının tam sayı hali: " + tamSayiFiyat + " TL");
    System.out.println("Velinin birikimleri byte cinsinden: " + (byte) veliTumBirikim);
    System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
    }
}
    /*
    Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
    Ali, bir ürünün fiyatını 123.456 TL olarak görüyor. Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
    Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
    Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.
    Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.
     */