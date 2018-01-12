public class Bedroom extends Room {

    private int roomNumber;
    private Type type;
    private double rate;

    public Bedroom(int roomNumber, Type type, double rate) {
        super(0);
        this.roomNumber = roomNumber;
        this.type = type;
        this.rate = rate;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public Type getType() {
        return this.type;
    }

    public double getRate() {
        return this.rate;
    }

    public int getCapacity(){
        return this.type.getCapacity();
    }
}
