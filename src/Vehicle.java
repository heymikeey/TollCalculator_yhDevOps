public abstract class Vehicle {
    String regNr;
    
    public abstract int getFee();
    public abstract String getType();
    
    protected Vehicle(String regNr) {
        this.regNr = regNr;
    }
    

}
