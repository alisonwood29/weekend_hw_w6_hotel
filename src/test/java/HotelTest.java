import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("Prestonfield" );
        bedroom = new Bedroom( 1, Type.DOUBLE, 100);
        conferenceRoom = new ConferenceRoom("Italian Room", 12, 150);
        guest = new Guest("Alison");
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
        hotel.addConferenceRooms(conferenceRoom);
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

    @Test
    public void canCheckOutGuestFromConferenceRoom(){
        hotel.checkIn(guest, conferenceRoom);
        hotel.checkOut(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.guestCount());
    }

//    @Test
//    public void canCheckOutGuestFromConferenceRoom(){
//        hotel.checkIn(guest, conferenceRoom);
//        hotel.checkOut(conferenceRoom);
//        assertEquals(0, conferenceRoom.guestCount());
//    }




}
