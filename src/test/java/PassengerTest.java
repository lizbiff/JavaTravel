import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before

    public void before(){
        passenger = new Passenger("Rachel", 3);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Rachel", passenger.getPassengerName());
    }

    @Test

    public void canGetPassengerBagCount(){
        assertEquals(3, passenger.howManyBags());
    }
}
