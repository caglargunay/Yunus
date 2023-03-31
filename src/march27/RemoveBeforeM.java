package march27;

public class RemoveBeforeM {
    public static void main(String[] args) {

        //Remove all letters which is before 'm' in alphabetic order from a given word
        String word="alphabeticzrtyZZZ";

        String newWord="";

        for (int i = 0; i < word.length(); i++) {
            char activeLetter=word.charAt(i);
            if((activeLetter>='m'&& activeLetter<='z')|| (activeLetter>='M' && activeLetter<='Z'))newWord +=activeLetter;

        }
        System.out.println(newWord);


    }
}
