package march26;

import java.util.Arrays;

public class Add1000PrimeWithArray {
    public static void main(String[] args) {
        //Add first 1000 prime numbers in  array

        int []primeNumbers=new int[10];

        int activeNummer=2;
        int counterArray=0; //asal sayıları ama amac asallara dizine atmak

        while (true){
            if(counterArray==10)
                break;

            // to check if the number is prime or not önemli
            boolean isPrime=true ;
            for(int i=2; i<activeNummer ; i++){
                if (activeNummer%i ==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){ //isprime true ise
                primeNumbers[counterArray]=activeNummer ;
                counterArray++ ;
            }

            activeNummer++ ;


        }
        System.out.println((Arrays.toString(primeNumbers))); //array i yazdırma yöndtemi

    }
}
