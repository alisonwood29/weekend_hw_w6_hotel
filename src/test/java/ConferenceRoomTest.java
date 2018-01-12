import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Pentland", 10, 120);
    }

    @Test
    public void hasName(){
        assertEquals("Pentland", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasRate(){
        assertEquals(120, conferenceRoom.getRate(), 0.1);
    }
}
