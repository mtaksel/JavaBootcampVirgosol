package Tasks.Day6;

public class task3 {

    public String animalType;
    public String animalName;
    public int animalAge;

    public task3(String type, String name, int age) {

        this.animalType = type;
        this.animalName = name;
        this.animalAge = age;
    }

    public static void main(String[] args) {

        task3 animal = new task3("cat","yudi",5);
        System.out.println(animal.animalName);
    }
}
/*
3)Bir sınıf oluşturun ve bu sınıfa ait bir constructor tanımlayın. Constructor içinde bir değeri başlatın ve bu değeri ekrana yazdırın.
 */