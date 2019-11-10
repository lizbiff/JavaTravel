public enum Plane {

    BOEING747(100, 1000),
    BOEINGTEST(5, 1000);


    private final int peopleCapacity;
    private final int loadCapacity;

    Plane(int peopleCapacity, int loadCapacity) {
        this.peopleCapacity = peopleCapacity;
        this.loadCapacity = loadCapacity;
    }

    public int getPeopleCapacity(){
        return this.peopleCapacity;
    }

    public int getLoadCapacity(){
        return this.loadCapacity;
    }


}
