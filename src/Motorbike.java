public class Motorbike extends Vehicle { 
    public static final String TYPE = "MC";

    public Motorbike(String regNr) {
        super(regNr);
    }

    public int getFee() {
        return 8;
    } 
    
    public String getType() {
        return TYPE;
    }
}
