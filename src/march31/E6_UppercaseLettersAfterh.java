package march31;

public class E6_UppercaseLettersAfterh {
    public static void main(String[] args) {

        //*write a program which counts letters after H in alphabetic order

        String text="Hi friends,My name is Caglar. What is your name?";

        String sent="";
        int count=0;

        for (int i = 0; i < text.length(); i++) {
            text=text.toLowerCase();
            char ch=text.charAt(i);

                    if(ch>'h' && ch<='z'){
                        count++ ;
                        //System.out.print(ch);
                    }
        }
        System.out.println(count);

    }
}
