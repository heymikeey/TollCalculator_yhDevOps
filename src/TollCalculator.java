import java.time.LocalDateTime;
import java.util.*;

public class TollCalculator {
    private int maxFee;
    private int weekendFee;
    private int maxTotal;
    
    public TollCalculator() {
        this.maxFee = 18;
        this.weekendFee = 0;
        this.maxTotal = 60;
    }

    //  Räkna ut om det är helgdag
    public boolean isTollFreeDate(LocalDateTime date) {
        return (date.getDayOfWeek().toString().equals("SATURDAY") ||
                date.getDayOfWeek().toString().equals("SUNDAY"));
    }


    // Huvudmetod som räknar ut dagsavgift för en bil
    /*public int getTollFee(Vehicle vehicle, LocalDateTime[] dates) {

        int totalFee = 0;

        for (Date date : dates) {
            
        }
        return totalFee;
    }

     */
    
    // Räkna ut om det är helgdag
       

    // Räkna ut om det är rusningstid
        

    // Skriv ut summering i terminalen
    private void printTollFee(Vehicle vehicle, LocalDateTime[] dates, int totalFee){
            String dayOfWeek = dates[0].getDayOfWeek().toString();

            System.out.println("\n" +
                    "The daily fee for vehicle: " + vehicle.regNr + "\n" +
                    "The type of vehicle being: " + vehicle.getType() + "\n" +
                    "On the date and time(s):   " + Arrays.toString(dates) + "\n" +
                    "On the day of week:        " + dayOfWeek + "\n" +
                    "Is a total of:             " + totalFee + "kr" +
                    "\n");

    }
}
