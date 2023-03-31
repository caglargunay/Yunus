package march25;

public class ex4 {
    public static void main(String[] args) {
        //write a program that finds the sum of numbers from 1 to the factorial of a given number
      int num=5;
      int a=1;
        for (int i = 1; i <= num; i++) {
            a*=i ;

        }
        int sum=0;
        for (int i = 0; i <= a; i++) {
            sum+=i;

        }
        System.out.println(sum);
    }

}
