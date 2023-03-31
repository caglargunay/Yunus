package march29;

public class RemoveSpace {
    public static void main(String[] args) {
        //Remove all spaces at the beginning and at the ending of a given string.
        // If there are more than one space between words, decrease them to one space

        String text=" hello   world  ";

        String space="";

        text=text.trim();
        text=text.replaceAll("[ ]+"," ");//köşeli parantex yerie " +"
        System.out.println(text);

        //second Solution
        String text2="    hello    worldd      ";
        text2=text2.trim();
        String newText2="";
        for (int i = 1; i <text2.length() ; i++) {
         //   char firstChar=

        }



        }

    }

