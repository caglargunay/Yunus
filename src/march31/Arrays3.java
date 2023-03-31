package march31;

public class Arrays3 {


    public static void main(String[] args) {
        //Print all words which starts "F" in given array
        String[] names={"Ali","Fatma","Yasin","Metin","Filiz"};



        for (int i = 0; i < names.length; i++) {
            
            if ('F'== names[i].charAt(0)) {
                System.out.println(names[i]);
            }
            
        }


        for (int i = 0; i < names.length; i++) {
            String each=names[i];
            if(each.startsWith("F")) System.out.println(names[i]);
        }
        

    }



}
