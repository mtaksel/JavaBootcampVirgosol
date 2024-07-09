package Tasks.Day6;

public class task10 {

    public String bookName;
    public String bookAuthor;

    public task10(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;

        System.out.println(this.bookName);
        System.out.println(this.bookAuthor);
    }

    public static void main(String[] args) {

        task10 bookName = new task10("1984", "Orwell");
    }
}

    /*
    10)Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın. Constructor içinde iki değişkeni başlatın ve bu değişkenlerin değerlerini ekrana yazdırın.
    */
