public abstract class Vehicle {
    String regNr;
    
    public abstract int getFee();
    
    protected Vehicle(String regNr) {
        this.regNr = regNr;
    }
}
