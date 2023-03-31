package march29;

public class DisplayAllTimes {
    public static void main(String[] args) {
        //*Display all the possible times in a 24-hour clock system on the screen? For example:
        //
        //00:00
        //00:01
        //00:02
        //...
        //23:58
        //23:59

        for (int i = 0; i <=23 ; i++) {
            for (int j = 0; j <=59 ; j++) {
                String hour=String.valueOf(i); //""+i böle de yazılabilir
                String minutes=String.valueOf(j);//""+i böle de yazılabilir

                if(hour.length()==1) hour="0" + hour;
                if (minutes.length()==1) minutes ="0"+minutes;

                System.out.println(hour+":"+minutes);

            }
        }
    }
}
