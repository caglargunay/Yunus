package march31;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // 1-100 e akdar çift sayıları
        //bir dizi içine atın

        int [] evenNumbers=new int[100];

        for (int i = 0, j=0; i <100 ; i++) {
            if(i%2==0){

                evenNumbers[j]=i ;
                j++ ;
            }

        }

        String index=Arrays.toString(evenNumbers);//arrays çıktı alabilmek için stringe dönüşmesi gerekiyor
        System.out.println(index);
        System.out.println(Arrays.toString(evenNumbers));

        for (int i = 0; i <evenNumbers.length ; i++) {

            System.out.print(evenNumbers[i]+ " "); //For ile arrays yazdırma

        }

    }
}
