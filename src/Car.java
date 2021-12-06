public class Car extends Vehicle {
    public static final String TYPE = "CAR";
    
    public Car(String regNr) {
        super(regNr);
    }

    public int getFee() {
        return 11;
    }
    
    public String getType() {
        return TYPE;
    }
}
