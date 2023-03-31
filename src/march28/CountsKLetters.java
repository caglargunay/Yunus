package march28;

public class CountsKLetters {
    public static void main(String[] args) {
        String text= "kemalkalemkak";
        text+=" ";
        int count=text.split("k").length;
        System.out.println(count-1);
        System.out.println(text);

    }
}
