package march31;

public class E8_EachDigitLastDigit {
    //Replace each digit in a string with the last digit of its result when multiplied by 7
    //
    public static void main(String[] args) {

        String str = "Hello World, 123456789 Wooden Spoon.",
                result = "";
        int secondDigit = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                secondDigit = (Integer.parseInt("" + ch) * 7) % 10;//cha i int cevirip üzerinde math işlemi yap
                result += secondDigit;

            } else result += ch;


        }

        System.out.println(result);


    }

    }








