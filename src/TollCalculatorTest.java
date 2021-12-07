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
}
