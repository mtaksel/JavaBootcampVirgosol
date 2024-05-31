package Practice.day2;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 15;

        if (a == b && b == c && a == c) {
            System.out.println("eşkenar üçgen");
        } else if (a == b || b == c || a == c); {
            System.out.println("Ikız kenar ucgen");
        }

    }
}
