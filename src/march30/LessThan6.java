package march30;

public class LessThan6 {
    public static void main(String[] args) {
        //change '*'all numbers which are less than 6 to in a given string
        // ;

        String text="caglar149842349engin327443!^!23";

        System.out.println(text);
        System.out.println(text.replaceAll("[0-5]","&"));

        // second solution
        String newText="";
        for (int i = 0; i <text.length() ; i++) {

            // String ch=""+text.charAt(i);
            char ch=text.charAt(i);

            if(ch>='0' && ch <'6' ){

                newText +="*";
            }else {
                newText+=ch;
            }


        }
        System.out.println(newText);
    }
}
