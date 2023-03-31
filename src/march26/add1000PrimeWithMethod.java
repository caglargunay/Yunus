package march26;

import java.util.Arrays;

public class add1000PrimeWithMethod {
    public static void main(String[] args) {
        //Add first 1000 prime numbers in a array
        int[] primeNumber=new int[1000]; //1000 haneli int dizisi oluşturduk

       int activeNumber=2 ;
       int index=0;

       while (true){
           if(isPrime(activeNumber)){
               primeNumber[index]=activeNumber;
               index++;
           }
           if(index==1000) break;
           activeNumber++ ;//asal olup olmadğı kontrol edilen sayı

        }
        System.out.println(Arrays.toString(primeNumber));




    }
    //main method bitti


    //asal sayıları bulan mthod oluşturduk adı isPrime Methodu
   public static boolean isPrime(int number) { //sayı asal mı değil mi methodu

        boolean asal = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asal = false;
                break;
            }
        }
        return asal;

    }

}
