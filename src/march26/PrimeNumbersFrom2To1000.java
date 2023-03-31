package march26;

public class PrimeNumbersFrom2To1000 {
    public static void main(String[] args) {


        //List the prime numbers from 2 to 1000  whose sum of the digit is also prime

        for (int i = 2; i < 1000; i++) {
            if (add1000PrimeWithMethod.isPrime(i) && add1000PrimeWithMethod.isPrime(sumOfDigit(i))) {
                System.out.println(i);

            }

        }

    }

    private static int sumOfDigit(int number) {
        int sum = 0;


        //sayının rakamaları toplamı ezberle tüm digit işlemlerinde bunun kullanabilirsin
        while (number > 0) { //
            sum += number % 10;
            number /= 10;


        }
        return sum;


    }
}
