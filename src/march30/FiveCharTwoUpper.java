package march30;

public class FiveCharTwoUpper {
    public static void main(String[] args) {
        ////*write a program which checks
        //// if a five character string's first two characters are uppercase letters
        //// and next two characters are lowercase letters and last character is any vowel


        String five="ABa2e";
        String letters="";
        String numeric="";
        //match ve regex cok önemli!!!!!!.
        boolean isMatch=five.matches("[A-Z]{2}[a-z]{2}[AEIOUaeiuo]");

        System.out.println( isMatch);

       // String regex="[0-9A-Za-z_]";.. olursa 3 karekterli ilk karekter harf küçük büyük  sonraki 2 karekter hersey alabilir
        //String regexSame="\\w";

        //String regex1="[0-9]";
       // String regex1Same="\\d"; +  koyarsan hepsini alır koymazsan sadece bir  karakter alır

     //   String regexSpace="\\s";
    }
}
