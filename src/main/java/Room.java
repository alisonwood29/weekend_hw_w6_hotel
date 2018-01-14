import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();

    }

//    public Room() {
//        this.guests = new ArrayList<>();
//    }

    public int getCapacity() {
        return this.capacity;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public void removeAllGuests() {
        this.guests.clear();
    }

//    public String getGuestName() {
//        return this.guests.get(0).getName();
//    }

    public ArrayList<Guest> getGuests() {
        ArrayList<Guest> guestsCopy = new ArrayList<>(this.guests);
        return guestsCopy;
    }
}
