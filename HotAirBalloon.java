public class HotAirBalloon{
    //Attributes
    private String type;
    private float cost;
    private String rental;
    private float speed;
    private int numPassengers;

    //Constructor
    public HotAirBalloon(String type, float cost, String rental, float speed, int numPassengers) {
        this.type = type;
        this.cost = cost;
        this.rental = rental;
        this.speed = speed;
        this.numPassengers = numPassengers;
    }

    //Accessor Methods
    public String getType() {
        return type;
    }

    public float getCost() {
        return cost;
    }

    public String getRental() {
        return rental;
    }

    public float getSpeed() {
        return speed;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    //Mutator Methods
    public void setType(String type) {
        this.type = type;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setRental(String rental) {
        this.rental = rental;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
