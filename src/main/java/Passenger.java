public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;


    }


    public String getPassengerName(){
        return this.name;
    }


    public int howManyBags() {
        return this.numberOfBags;
    }

//    public int getWeightOfBags(){
//        return this.weightOfBags;
//    }
}

