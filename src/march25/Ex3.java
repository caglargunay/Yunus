package march25;

public class Ex3 {
    public static void main(String[] args) {
        //*String ages="Yunus38,Aysel19,Mahmud32,Elif23";
        //write a program that outputs above string like example:
        //"Yunus is 38 years old."
        //"Aysel is 19 years old."
        //.
        //.
        //.

        String ages="Yunus38,Aysel19,Mahmud32,Elif23";
      /*  i couldnt , split ile yazılması gayet mantıklı
       int a=ages.length();
        String []nummer={};
        String []alp={};
        for (int i = 0; i < 9; i++) {
            nummer +=i ;

            }
        for (char i = 'a'; i < 'Z' ; i++) {

            System.out.println();

        }

        }



        for (int i= 0; i <a ; i++) {

            if (ages.substring(i,i+1)==){

        }

  */

        //Yunus un yaptığı çoko mantıklı
        String[] persons=ages.split(",");// Burada , atıyor ayrıca dizine çeviriyor but why
        for (int i = 0; i <persons.length ; i++) { //string sayısı kadar dögü
            String person=persons[i]; // döngü içinde peron dizisi oluşturuyor
            String name1=person.replaceAll("[^a-zA-Z]","");//
            String age1=person.replaceAll("[^0-9]","");
            System.out.println(name1+" is "+age1+" years old.");
        }


    }
}