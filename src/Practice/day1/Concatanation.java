package Practice.day1;

public class Concatanation {
    public static void main(String[] args){

        System.out.println("Benim memleketim:" + " Bursa");

        String str1 = "Benim kedimin adı:";
        String str2 = "şanslı";
        String strResult = str1 + " " + str2 + ".";

        System.out.println(strResult);

        String strResult2 = str1 + 10 + 10;

        System.out.println(strResult2);

        String strResult3 = str1 + (10+10);

        System.out.println(strResult3);

        String strResult4 = 10 + 10 + str1;

        System.out.println(strResult4);

        String strResult5 = 10.0 + 10 + str1;

        System.out.println(strResult5);

        String strResult6 = 10.0 + (10 + str1);

        System.out.println(strResult6);

    }
}
