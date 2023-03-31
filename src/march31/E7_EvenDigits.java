package march31;

public class E7_EvenDigits {
    public static void main(String[] args) {
        //*write a program which counts the even digits of a string

        String text="aascs43848t350dss320r2";
        int counter=0;

        for (int i = 0; i <text.length(); i++) {
            char ch=text.charAt(i);

            if(ch== '0' || ch=='2'|| ch=='4'|| ch=='6'|| ch=='8' ){

                counter++;

            }

        }
        //second Solution
        System.out.println(text.replaceAll("[^24680]","").length());
        System.out.println(counter);
    }

}
