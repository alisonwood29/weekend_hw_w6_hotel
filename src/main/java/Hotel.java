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

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIn(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void checkOut(Guest guest, Room room){
        room.removeGuest(guest);
    }

    public ArrayList<String> getGuestsNames(Bedroom bedroom) {
        ArrayList<Guest> guestsCopy = new ArrayList<>(bedroom.getGuests());
         ArrayList<String> guestNames = new ArrayList<>();
//        String result = "";
        for(Guest guest: guestsCopy){
            guestNames.add(guest.getName());
//            result = guest.getName();
        }
//        return result;
        return guestNames;
    }


//    Still not really understanding loops. Got it working but what is the line String result = null doing? A default value?


//    public String getGuest(Bedroom bedroom) {
//        return bedroom.getGuestName();
//    }

    public ArrayList<Integer> checkVacantBedrooms() {
        ArrayList<Integer> roomNumbers = new ArrayList<>();
//        this initializes a new arrayList so that we can add things to it
        for(Bedroom bedroom: this.bedrooms){
            if(bedroom.guestCount() == 0){
                roomNumbers.add(bedroom.getRoomNumber());
            }
        }
        return roomNumbers;
    }


    public ArrayList<String> checkVacantConferenceRooms() {
        ArrayList<String> conferenceRoomNames = new ArrayList<>();
        for(ConferenceRoom conferenceRoom: this.conferenceRooms){
            if(conferenceRoom.guestCount() == 0){
                 conferenceRoomNames.add(conferenceRoom.getName());
            }
        }
        return conferenceRoomNames;
    }
}
