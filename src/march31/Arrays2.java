package march31;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        //Add numbers from 1 to 1000 into an array and find the sum of the numbers

        int [] numbers=new int[1000];
        for (int i = 0; i <1000 ; i++) {
            numbers[i]=i+1 ;

        }
        int sum=0;

        for (int i = 0; i < 1000; i++) {
            sum +=numbers[i] ;

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of allnumbers ="+ sum);

    }
}
