package march31;

public class E5_NewLine {
    public static void main(String[] args) {

        //Write each sentence of a given text in new line

        String sent="Hello everbody. what are you doing? hi. are you ok?";
        String specialChar=".!?" ;


        String eachSentence="";

        String [] sentencesArray=sent.split("[\\.!\\?]");
        for (String s:sentencesArray){
            System.out.println(s.trim());
        }

        }

    }

