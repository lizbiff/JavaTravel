public class Passenger {

    private String name;
    private int numberOfBags;
    private int weightOfBags;

    public Passenger(String name, int numberOfBags, int weightOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.weightOfBags = weightOfBags;

    }


    public String getPassengerName(){
        return this.name;
    }


    public int howManyBags() {
        return this.numberOfBags;
    }

    public int getWeightOfBags(){
        return this.weightOfBags;
    }
}

