package Tasks.Day1;

public class task10 {

    public static void main(String[] args)
    {
        boolean isGoodWeather = false;
        boolean isMoneyEnough = true;

        boolean yemegeCikabilmeSarti = isGoodWeather && isMoneyEnough;

        System.out.println("Yemeğe çıkabilme şartı sağlanmış mı : " + yemegeCikabilmeSarti);
    }
}
    /*
    Ali ve Veli, bir akşam yemeği için dışarı çıkmayı planlıyorlar. Ali'nin yemeğe çıkabilmesi için iki şart var:
    hava güzel olmalı ve Ali'nin yeterli parası olmalı.
    Havanın güzel olup olmadığını boolean havaGuzel değişkeni ile,
    Ali'nin yeterli parası olup olmadığını ise boolean yeterli Para değişkeni ile temsil ediyoruz.
    Java'da bu iki şartın sağlanıp sağlanmadığını kontrol eden ve sonucu ekrana yazdıran bir program yazınız.
     */