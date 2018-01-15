import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("Prestonfield" );
        bedroom = new Bedroom( 1, Type.DOUBLE, 100);
        bedroom2 = new Bedroom( 2, Type.DOUBLE, 100);
        bedroom3 = new Bedroom( 3, Type.DOUBLE, 100);
        conferenceRoom = new ConferenceRoom("Italian Room", 12, 150);
        guest = new Guest("Alison");

//        hotel.addBedroom(bedroom);
//        hotel.addBedroom(bedroom2);
//        realised when doing test to check for vacant rooms that i hadn't added the rooms to the hotels. doing it here broke my other tests so commented out but now not sure my other tests are actually working properly!
//        would make an empty hotel as above and then create another hotel that has rooms in it and test that.
    }

    @Test
    public void hasName(){
        assertEquals("Prestonfield", hotel.getName());
    }

    @Test
    public void hotelHasNoBedrooms(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void hotelHasNoConferenceRooms(){
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void canAddBedrooms(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkIn(guest, bedroom);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkIn(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.checkIn(guest, bedroom);
        hotel.checkOut(guest, bedroom);
        assertEquals(0, bedroom.guestCount());
    }
//    this bedroom is not actually in the hotel so a better test would be to check the number of guests in the hotel rather than in the bedroom

    @Test
    public void canCheckOutGuestFromConferenceRoom(){
        hotel.checkIn(guest, conferenceRoom);
        hotel.checkOut(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.guestCount());
    }

//    @Test
//    public void canSeeGuestsInRoom(){
//        hotel.checkIn(guest, bedroom);
//        assertEquals("Alison", hotel.getGuest(bedroom));
//    }

    @Test
    public void canGetCopyOfGuestsInRoom(){
       hotel.checkIn(guest, bedroom);
       ArrayList<String> expected = new ArrayList<>();
       expected.add("Alison");
       assertEquals(expected, hotel.getGuestsNames(bedroom));
    }

    @Test
    public void canSeeVacantBedrooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.checkIn(guest, bedroom);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        assertEquals(expected, hotel.checkVacantBedrooms());
    }

    @Test
    public void canSeeVacantBedConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Italian Room");
        assertEquals(expected, hotel.checkVacantConferenceRooms());
    }




}
