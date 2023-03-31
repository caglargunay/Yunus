package march26;

public class WhatisMethod {

    //aşağıda 3 farklı method tanımlandı.
    public static void main(String[] args) {

        // topla methodu
        System.out.println(topla(4,7));

        seLamla("yunus");
        System.out.println(isEven(4));
    }

    //topla methodu oluşturduk methodumuz 2 int topluyor
    public static int topla(int num1, int num2){
        return num1+num2 ;
    }
    // isEven methodu ise tek mi çift mi olduğunu buluyor
    public static boolean isEven(int number){
        if (number %2 ==0) {
            return true;
        }
        return false;
    }

    //selamla methodu ise selamla
    //return yapmadık.
    //çıktı icerde bu methoddda ben yukarıda sout kullanamam
    public static void seLamla(String name){

        System.out.println("Merhaba" +name+ "nasılsın?");
    }
}
