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

    public String getGuest(Bedroom bedroom) {
        return bedroom.getGuestName();
    }

//    public String[] getGuestsNames(Bedroom bedroom) {
//        String[] result;
//        for(Guest guest: bedroom.getGuests()){
//           result = guest.getName();
//        }
//        return result;
//    }

//    public void checkOut(Room room){
//        room.removeAllGuests();
//    }




}
