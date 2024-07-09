package Tasks.Day6;

public class task11 {

    public String bookName;
    public String bookAuthor;
    public int year;

    public task11(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public task11(String bookName, String bookAuthor, int year) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.year = year;
    }

    public void library(){
        System.out.println(bookName);
        System.out.println(bookAuthor);
        System.out.println(year);
    }

    public static void main(String[] args) {
        task11 library1 = new task11("1984", "orwell" , 1949);
        task11 library2 = new task11("1984", "orwell");

        library1.library();
        library2.library();
    }
}

    /*
    11)Bir sınıf oluşturun ve bu sınıfta iki farklı constructor tanımlayın. Constructor'lar farklı parametreler alsın (overloading).
     */