package march25;

public class ex1 {
    public static void main(String[] args) {
        //*write a program that counts the uppercase vowels of a given sentences

        String text = ("AecscECDcIIxssUaAAEU");
        String upperVowels = "AEIOU";
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (upperVowels.contains(text.substring(i, i + 1))) {

                counter++;
            }
        }
        System.out.println(counter);




    }
}
