import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before(){
        room = new Room(2);
        guest = new Guest("Alison");
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

    @Test
    public void canGetGuestName(){
        room.addGuest(guest);
        assertEquals("Alison", room.getGuestName());

    }

}
