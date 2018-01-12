public class ConferenceRoom extends Room {

    private String name;
    private double rate;

    public ConferenceRoom(String name, int capacity, double rate) {
        super(capacity);
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return this.name;
    }

    public double getRate() {
        return this.rate;
    }
}
