package march28;

import java.util.Arrays;

public class Vowel {
    public static void main(String[] args) {

    //*Put "-" after each vowel which is before another vowel in a string
        //iki ünlü arasına '-' işareti konmak

        String str = "aaafsağfaknfnşkansfnşaaeibcouasaas";//son ikisi ünlü olunca çalışmıypr burak can yaptı

        String result = "";
        String vowels = "AAEIOUaeiou";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result += ch;

            if (vowels.contains("" + ch) && vowels.contains("" + str.charAt(i + 1))) {
                result += "-";
            }
        }

        System.out.println(result);


    }
}
