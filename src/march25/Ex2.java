package march25;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        //write a program that sorts three given words in alphabetic order
        // alfabetik sıralama Array ile yapılıyor

        Scanner scan=new Scanner((System.in));

        System.out.println("write 3 words");

        String t1= scan.nextLine();
        String t2=scan.nextLine();
        String t3=scan.nextLine();
        String []words={t1,t2,t3}; //Dizi oluşturduk word dizisi

        Arrays.sort(words);

        System.out.println(Arrays.toString(words)); //Array den stringe ceviriyor
        //yunus string içinde compare de yaptı ona bak
       // String[]words ={"araba","elma","kiraz"} yarım kaldı


    }
}
