package march29;

import java.util.Random;

public class lowercaseChar {
    public static void main(String[] args) {
      //Create a string which contains only random 10_000 lowercase
        // characters and check if the string contains "you"

        Random random=new Random();
        String text="";

        String alphabet="";
        for (char i='a';i<='z'; i++) //lowercase oldupu için
            alphabet+=i;

        for (int i = 0; i <= 10000; i++) {
            int rastgele=random.nextInt(alphabet.length());//alfabenin uzunluğu 26 da yazabiliriz
            int randomIndex=random.nextInt(alphabet.length()); //örneğin4 geldi
            text+=alphabet.charAt(randomIndex);//alfabenin 4 harfinin alıp text e ekliyoruz

        }
        if (text.contains("you")){
            System.out.println("Text contains 'you'");
        }else{
            System.out.println("text doesnt contain you");
        }
    }
}
