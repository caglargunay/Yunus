package march29;

public class EightCharaechter {
    public static void main(String[] args) {
        //*write a program which checks
        // if a eight charactered string's first two characters are number
        // and next two characters are lowercase letters and next three characters are any
        // number and last character is upparcase letter.


        String eight="12kl123a";
        String letters="";
        String numeric="";
        //match ve regex cok önemli.
            boolean isNoMatter=eight.matches("[0-9]{3}[A-Z]{2}.{2}");//TODO MATCHES VE REGEX
            boolean isMatch=eight.matches("[0-9]{3}[A-Z]{2}");
        System.out.println( isMatch);









    }
}
