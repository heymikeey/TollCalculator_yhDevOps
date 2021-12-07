import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TollCalculatorTest {
    TollCalculator tollCalculator = new TollCalculator();
    Vehicle car = new Car("bte394");
    Vehicle mc = new Motorbike("trq290");
    LocalDateTime nonRushHour = LocalDateTime.of(2021, 12, 6, 10, 10, 19);
    LocalDateTime morningRushHour = LocalDateTime.of(2021, 12, 6, 8, 10, 19);
    LocalDateTime afternoonRushHour = LocalDateTime.of(2021, 12, 6, 16, 30, 0);
    LocalDateTime weekend = LocalDateTime.of(2021, 12, 5, 9, 15, 44);


    // Test av normaltaxa av bil samt MC
    // Bilar kostar normalt 11 kr för att passera vägkamera
    // Motorcyklar kostar normalt 8 kr för att passera vägkamera
    @Test
    public void testVechileFee() {

        Assertions.assertEquals(11, car.getFee());
        Assertions.assertEquals(8, mc.getFee());

    }

    // Test av helgtaxering för bil samt MC
    // Lördagar och Söndagar är avgiftsfria
    @Test
    public void testWeekendFee() {

        Assertions.assertEquals(true, tollCalculator.isTollFreeDate(weekend));
        Assertions.assertEquals(false, tollCalculator.isTollFreeDate(nonRushHour));

    }

    // Test av maxtaxering för bil samt MC
    // Rusningstrafik mellan (8:00 - 9:00) och (16:00-17:00) ger maxtaxa (18 kr)
    @Test
    public void testRushHourFee() {
        LocalDateTime rushHours = morningRushHour, afternoonRushHour;

        Assertions.assertEquals(true, tollCalculator.isRushHour(rushHours));
        Assertions.assertEquals(false, tollCalculator.isRushHour(weekend));
    }
    
    // Test av maxtaxering för bil samt MC
    // Högsta dagliga avgiften får aldrig överskrida 60 kr
    @Test
    public void testTotalMaxFee() {
        LocalDateTime[] mix = {nonRushHour, morningRushHour, nonRushHour, afternoonRushHour, nonRushHour, nonRushHour};
        
        Assertions.assertEquals(60, tollCalculator.getTotalTollFee(car, mix));  //Taxa för bil utan maxtak är 76kr
        Assertions.assertEquals(60, tollCalculator.getTotalTollFee(mc, mix));   //Taxa för MC utan maxtak är 68kr
        
    }

}
