package march31;

import java.util.Arrays;

public class HundrentEvenNumbersWithArrays {
    public static void main(String[] args) {
        int [] evenNumbers=new int[100];

        int numbers=0;
        int count=0 ;
        while (true){

            if(numbers%2==0){
                evenNumbers[count]=numbers ;
                count++ ;

            }
            numbers++ ;
            if(count==100){
                break;
            }

        }
       // String  index= Arrays.toString(evenNumbers);

        System.out.println(Arrays.toString(evenNumbers));


    }
}
