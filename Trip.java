public class Trip {
    private String destination;
    private int days;
// constructor
    public Trip(String destination, int days){
        this.days = days;
        this.destination = destination;
    }
    public Trip(Trip other){
        this.days = other.days;
        this.destination = other.destination;
    }
    public String getDestination(){
        return destination;
    }
    public int getDays(){
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return " Trip to " + destination + " for " + days + " days. ";
    }
    public boolean equals(Trip other){
        return this.destination.equals(other.destination) && this.days == other.days;

    }

    public  Trip extend(Trip other){
        String newDestination = this.destination + " & " + other.destination;
        int newDays = this.days + other.days;
        return new Trip(newDestination, newDays);

    }



}
