import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guests = new ArrayList<>();
        guest = new Guest("Alison");
        room = new Room(2);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, room.guestCount());
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest);
        assertEquals(1, room.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        room.addGuest(guest);
        room.removeGuest(guest);
        assertEquals(0, room.guestCount());
    }

    @Test
    public void canRemoveAllGuests(){
        room.addGuest(guest);
        room.addGuest(guest);
        assertEquals(2, room.guestCount());
        room.removeAllGuests();
        assertEquals(0, room.guestCount());
    }

//    @Test
//    public void canGetGuestName(){
//        room.addGuest(guest);
//        assertEquals("Alison", room.getGuestName());
//    }

    @Test
    public void canGetCopyOfGuestNames(){
        ArrayList<Guest> nameCopy = room.getGuests();
        boolean expected = guests.equals(nameCopy);
        assertEquals(true, expected);
    }
//    I kept changing this around a bit but not sure if it is actually working. Maybe need a bit of clarification on what the copy method is doing!

}
