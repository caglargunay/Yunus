package march25;

public class ex5 {
    public static void main(String[] args) {
        //String videos="DAY 01 - Introduction to Java Programming\n" +
        //                "DAY 02 - First Java Programming\n" +
        //                "Day 03 - Escape Sequences\n" +
        //                "Day 04 - Variables: Primitive, String\n" +
        //                "Day 05 - String Concatenation\n" +
        //                "Day 06 - Primitive Type Castings, Arithmetic Operators\n" +
        //                "Day 07 - Operators: Unary, Shorthand, Relational\n" +
        //                "Day 08 - Logical Operators, Single If Statement\n" +
        //                "Day 09 - If & Else and Multi-Branch If Statements\n" +
        //                "Day 10 - Nested If & Ternaries\n" +
        //                "Day 11 - Switch Statement, Scanner Intro\n" +
        //                "Day 12 - Scanner\n" +
        //                "Day 13 - String\n" +
        //                "Day 14 - String\n" +
        //                "Day 15 - For Loops\n" +
        //                "Day 16 - For Loop & String Practices\n" +
        //                "Day 17 - Branching statements, While & Do - While loops\n" +
        //                "Day 18 - Nested Loops\n" +
        //                "Day 19 - Recap: Loops & String";
        //        //Set the videos variable with taking first words of each day
        //        //Example:
        //        // Day 01 - Introduction
        //        // Day 02 - First
        //        // Day 03 - Escape
        //        //.
        //        //.
        //        //.


        String videos=  "DAY 01 - Introduction to Java Programming\n" +
                        "DAY 02 - First Java Programming\n" +
                        "Day 03 - Escape Sequences\n" +
                        "Day 04 - Variables: Primitive, String\n" +
                        "Day 05 - String Concatenation\n" +
                        "Day 06 - Primitive Type Castings, Arithmetic Operators\n" +
                        "Day 07 - Operators: Unary, Shorthand, Relational\n" +
                        "Day 08 - Logical Operators, Single If Statement\n" +
                        "Day 09 - If & Else and Multi-Branch If Statements\n" +
                        "Day 10 - Nested If & Ternaries\n" +
                        "Day 11 - Switch Statement, Scanner Intro\n" +
                        "Day 12 - Scanner\n" +
                        "Day 13 - String\n" +
                        "Day 14 - String\n" +
                        "Day 15 - For Loops\n" +
                     "Day 16 - For Loop & String Practices\n" +
                        "Day 17 - Branching statements, While & Do - While loops\n" +
                       "Day 18 - Nested Loops\n" +
                       "Day 19 - Recap: Loops & String";

        String[] videolist=videos.split("\n"); //\n atıyor

        for (int i = 0; i <videolist.length ; i++) {

            String line=videolist[i];


            String starting=line.split("-")[0];//split ikiye bölüyor 0. karekteri alıyor
            String ending=line.split("-")[1].split(" ")[1];// line ilkin 2 ye böl 1.sini al. sonra aldığını tekrar böl boşlupa kadar 1. al.

            String result=starting+"-"+ending ;
            result=result.replace(":",""); // ':' kaldırıyor

            System.out.println(result);
        }
    }
}
