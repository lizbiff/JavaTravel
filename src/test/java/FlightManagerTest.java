import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private ArrayList<Passenger> passengers;

    @Before
    public void before(){

        flightManager = new FlightManager(Plane.BOEING747);

        passengers = new ArrayList<Passenger>();

        passenger1 = new Passenger("Rachel", 3);
        passenger2 = new Passenger("Levi", 2);
        passenger3 = new Passenger("Rebecca", 4);
        passenger4 = new Passenger("Hannah", 1);

        flight = new Flight(Plane.BOEINGTEST, 123, "London", "Glasgow", "12:00");


    }

    @Test

    public void canCalculateHowMuchWeightForBagPerPerson(){
        assertEquals(5, flightManager.bagWeightPerPerson());
    }

//    @Test
//    public void canCalculateHowMuchBaggageWeightIsBooked(){
//        this.flight.addPassenger(passenger2);
//        assertEquals(10, flightManager.howMuchBagWeightIsBooked());
//
//    }

}
