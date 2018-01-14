import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRooms(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIn(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void checkOut(Guest guest, Room room){
        room.removeGuest(guest);
    }

    public String getGuestsNames(Bedroom bedroom) {
        ArrayList<Guest> guestsCopy = new ArrayList<>(bedroom.getGuests());
        String result = null;
        for(Guest guest: guestsCopy){
            result = guest.getName();
        }
        return result;
    }


//    Still not really understanding loops. Got it working but what is the line String result = null doing? A default value?


//    public String getGuest(Bedroom bedroom) {
//        return bedroom.getGuestName();
//    }

    public int checkVacantBedrooms() {
        int result = 0;
        for(Bedroom bedroom: this.bedrooms){
            if(bedroom.guestCount() == 0){
                result = bedroom.getRoomNumber();
            }
        }
        return result;
    }





}
