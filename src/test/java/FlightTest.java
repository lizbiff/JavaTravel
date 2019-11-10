import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private ArrayList<Passenger> passengers;



    @Before
    public void before(){

        passengers = new ArrayList<Passenger>();

        passenger1 = new Passenger("Rachel", 3);
        passenger2 = new Passenger("Levi", 2);
        passenger3 = new Passenger("Rebecca", 4);
        passenger4 = new Passenger("Hannah", 1);

        flight = new Flight(Plane.BOEINGTEST, 123, "London", "Glasgow", "12:00");

    }

    @Test
    public void howManySeatsToBeginWith(){
        assertEquals(5, flight.avaiableSeats());
    }

    @Test
    public void howManySeatsAreAvaiable(){
        this.flight.addPassenger(passenger2);
        assertEquals(4, flight.avaiableSeats());
    }

    @Test
    public void canCountHowManyPassengersOnboard(){
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger3);
        this.flight.addPassenger(passenger4);

        assertEquals(4, flight.passengerCount());

    }

    @Test
    public void cannotAddMoreThanCapcacity(){
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger1);

        assertEquals(5, flight.passengerCount());

    }

    @Test
    public void canTotalUpHowManyBagsThereAre(){
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger2);
        this.flight.addPassenger(passenger3);
        this.flight.addPassenger(passenger4);

        assertEquals(10, flight.totalBags());

    }

}
