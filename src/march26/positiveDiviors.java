package march26;

public class positiveDiviors {
    public static void main(String[] args) {

        //1 den 1000 e kadarPozitif bölenlerinin sayısının toplamı kendisine eşit olan sayıyı bulun

        for (int i = 1; i <=1000 ; i++) {
            int sumOfPositiveDivisors =0;

            for (int j = 1; j <i ; j++) {
                if(i%j==0)sumOfPositiveDivisors+=j;

            }
            if (sumOfPositiveDivisors==i) System.out.println(i);
        }

    }
}
