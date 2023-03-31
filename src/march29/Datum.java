package march29;

import java.util.Random;

public class Datum {
    public static void main(String[] args) {

        Random random=new Random();
        String datum="";

        String numeric="";
        for (char i='0';i<='9'; i++)
            numeric+=i;

        for (int i = 0; i <= 100; i++) {
            int rastgele=random.nextInt(numeric.length());
            int randomIndex=random.nextInt(numeric.length());
            datum+=numeric.charAt(randomIndex);//
            System.out.println(datum);
        }
        if (datum.contains("2903")){
            System.out.println("Text contains '2903'");
        }else{
            System.out.println("text doesnt contain '2903' ");
        }
    }
}
