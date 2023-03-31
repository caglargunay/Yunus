package march26;

import java.util.Arrays;

public class SumOfMinAndMaxNumWithArray {
    public static void main(String[] args) {
        //Find the sum of minimum and maximun numbers of an array

        int[] number = {34, 2, 32, 65, 78, 123};

    /*
        int mın = number[0]; //0 elaman en küçük eleman varsayıyoruz
        int max = number[0];
        for (int i = 0; i < number.length; i++) {

            if (number[i]<mın){
                mın=number[i];

            }

            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println(max+mın);
        */

        //Second solution
        Arrays.sort(number);
        System.out.println(number[0]+number[number.length-1]);





    }

}
