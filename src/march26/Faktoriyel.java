package march26;

public class Faktoriyel {
    public static void main(String[] args) {

        //find 1 to 12 factoriyel bütün sayıların faktoriyelini bul

        for (int i = 1; i <=12 ; i++) {

            //1 den 12 e kadar sayıların toplamını bulan methodu yaz

            System.out.println(factorial(i));


        }





    }

    public static int factorial(int number){

        int fact=1;
        for (int i = 1; i <= number; i++) {
            fact*=i;

        }
        return fact;
    }




}
