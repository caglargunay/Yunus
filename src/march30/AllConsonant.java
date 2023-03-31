package march30;

public class AllConsonant {
    public static void main(String[] args) {
            //TODO DİSCORDAN CEVABI AL

        ////*change all consonant//sessiz letters to c and
        ////all vowel letters to v in a string which contains only letters.
/*
        String text="my name caglar";
        String ch="AEIOUaeio";
        String newText="";

        for (int i = 0; i <text.length() ; i++) {
            String activ=text.substring(i);
            newText=""+text.substring(i);
            for (char j = 'a'; j <'z' ; j++) {
                String lovervowel i;

            }
        }

*/


        String text="my!! name is!! CAglar";
        text=text.toLowerCase().replaceAll("[aeıioöuü]","v").replaceAll("[^aeıioöuüv,.!?]","c");

            }


        }



