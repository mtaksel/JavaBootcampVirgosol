package Tasks.Day6;

public class task7 {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public static void main(String[] args) {

        task7 person = new task7();
        person.setName("mehmet");
        System.out.println(person.getName());
    }


}

/* 7)Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın. Bu değişkeni getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
 */