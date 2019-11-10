import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Passenger passenger;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departingAirport;
    private String deptutureTime;


    public Flight(Plane plane, int flightNumber, String destination, String departingAirport, String deptutureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departingAirport = departingAirport;
        this.deptutureTime = deptutureTime;
        this.passengers = new ArrayList<Passenger>();
    }


    public int passengerCount(){
        return this.passengers.size();
    }

    public int avaiableSeats(){
        return (plane.getPeopleCapacity() - passengerCount());
    }

    public boolean hasEnoughCapacity(){
        if (passengerCount() < this.plane.getPeopleCapacity()){
            return true;
        } else {
            return false;
        }
    }

    public void addPassenger(Passenger passenger){
        if(hasEnoughCapacity() == true){
            this.passengers.add(passenger);
        }
    }

    public int totalBags(){
        int bagCount = 0;

        for (Passenger passenger:this.addPassenger(passenger))
        {bagCount += this.passenger.howManyBags();
        }

        return bagCount;
    }



}
