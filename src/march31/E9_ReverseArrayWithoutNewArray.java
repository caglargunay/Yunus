package march31;

import java.util.Arrays;

public class E9_ReverseArrayWithoutNewArray {
    public static void main(String[] args) {

      String[]words ={"hi","hello","whatsup","facebook"};

        for (int i = 0, j=words.length-1; i <words.length/2 ;i++,j--) {
            String temp=words[i];
            words[i]=words[j];
            words[j]=temp;
            }
        System.out.println(Arrays.toString(words));


        //second solution

        //String [] newWords=new String[words.length];









    }
}
