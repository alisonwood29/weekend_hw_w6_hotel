import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(15, Type.SINGLE, 60);
        guest = new Guest("Alison");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(15, bedroom.getRoomNumber());
    }

    @Test
    public void hasType(){
        assertEquals(Type.SINGLE, bedroom.getType());
    }

    @Test
    public void hasRate(){
        assertEquals(60, bedroom.getRate(), 0.1);
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void singleHasCapacity1(){
        int capacity = bedroom.getType().getCapacity();
        assertEquals(1, capacity);
    }

}
