public class TimeCalc {
    public static void main(String[] args) {
        // i need to get time from user and number of mintus
        // i need to change the time to mintus
        // to add the mintus and to do mod 12
        // then to convert it to 24 H clock
        int Hours = Integer.parseInt(args[0].substring(0,2));
        int mintus = Integer.parseInt(args[0].substring(3,5));
        int MinToAdd = Integer.parseInt(args[1]);
        Hours *= 60;
        MinToAdd+=(Hours += mintus);
        int NewHours = MinToAdd/60;
        NewHours %= 24;
        MinToAdd %=60 ;
        String Padding = "0";
        String FinalHours = Padding + Integer.toString(NewHours);
        String FinalMintus = Padding + Integer.toString(MinToAdd);
        System.out.println(FinalHours.substring(FinalHours.length()-2  ) +":" 
        + FinalMintus.substring(FinalMintus.length() -2 ));
        }
    }