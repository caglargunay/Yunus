package march28;

import java.util.Scanner;
import java.util.SortedMap;

public class Fivenames {
    public static void main(String[] args) {
        //*Take from the user five names and five ages and print them like example
        //Input
        //Yunus
        //34
        //
        //Ferhat
        //28
        //.
        //.
        //.
        //Output
        //Yunus is 34 years old.
        //Ferhat is 28 years old.
        //.
        //.
        //.
        //The older one is Yunus.


        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 5 names with ages");
        String []names=new String[5];
        int[]ages =new int[5];
        int older=Integer.MIN_VALUE ;
        String olderName="";

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter "+(i+1)+ ".  name.");
            names[i]=scan.nextLine();

            System.out.println("Enter "+(i+1)+ " .age ");
            ages[i]=scan.nextInt();

            scan.nextLine();

            if(older<ages[i]){
                older=ages[i];
                olderName=names[i];
            }


            }
        for (int i=0;i<ages.length;i++){
            System.out.println(names[i]+ " is " +ages[i]+ "years old.");

        }
        System.out.println("\n The older one is" + olderName);
    }
}
