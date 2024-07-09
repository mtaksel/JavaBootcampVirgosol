package Tasks.Day6.task12;

public class task12Child extends task12Parent{

    public void altSinifMsg(){
        mesaj();
    }

    public static void main(String[] args) {
        task12Child msg = new task12Child();
        msg.mesaj();
    }

}


/*
12)Bir üst sınıf ve bir alt sınıf oluşturun. Alt sınıf, üst sınıftan bir metodu miras alsın ve çağırarak ekrana yazdırsın.
 */