package march26;

public class PerfectWithMethod {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {


            if (isPrime(i)) System.out.println(i);
        }
    }
    public static boolean isPrime(int i){

        int sumOfPositiveDivisors =0;

        for (int j = 1; j <i ; j++) {
            if(i%j==0)  sumOfPositiveDivisors +=j;

        }
        if (sumOfPositiveDivisors==i) return true;

        return false;



    }
}
