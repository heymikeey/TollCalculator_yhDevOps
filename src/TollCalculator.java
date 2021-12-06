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

    // Huvudmetod som räknar ut dagsavgift för en bil 
    public int getTollFee(Vehicle vehicle, Date... dates) {
        Date intervalStart = dates[0];
        int totalFee = 0;
        for (Date date : dates) {
            
        }
        return totalFee;
    }
    
    // Räkna ut avgift för en bil en viss tid på dygnet
    public int getTollFee(final Date date, Vehicle vehicle) {
        return 0;
    }
    
    //Räkna ut avgift för en bil en viss tid på dygnet
    private boolean isTollFreeDate(Date date) {
        return false;
    }
}
