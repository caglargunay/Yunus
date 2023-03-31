package march27;

public class ReverseSentences {
    public static void main(String[] args) {

        //*Reverse each word of a given sentences

        String sentence="Hi, My name is Caglar";
        String newSentence="";
        String words[]=sentence.split(" ");//until each space,split (bölüyor
        //{"Hi," , "my ", "name", "is","yunus"

        for (int i = 0; i < words.length ; i++) {
            String word=words[i];
            String reversed="";

            for (int j =word.length()-1; j>=0 ; j--){
                reversed+=word.charAt(j);

            }
            newSentence+=reversed +" ";//we need space

        }
        System.out.println(newSentence.trim());
        //remove Space end of sentences

        System.out.println("-".repeat(100));


    }
}
