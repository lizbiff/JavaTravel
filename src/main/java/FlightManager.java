import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Passenger> passengers;
    private Plane plane;


    public FlightManager(Plane plane){
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }


    public int bagWeightPerPerson() {

        return (plane.getLoadCapacity() / this.passengers.size());
    }

    public int howMuchBagWeightIsBooked(){
        return (bagWeightPerPerson() * this.passengers.size());
    }

    public int bagWeightRemainsPerFlight(){
        return  (plane.getLoadCapacity() - howMuchBagWeightIsBooked());
    }


}
