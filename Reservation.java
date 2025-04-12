public class Reservation {
    String name;
    int dayCount;

    public Reservation(String name, int dayCount){
     this.name = name;
     this.dayCount = dayCount;
    }
    public Reservation(Reservation other){
        this.name = other.name;
        this.dayCount = other.dayCount;

    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    @Override
    public String toString() {
        return "Reservation name: " + name + ", Day Count:  " + dayCount;
    }
    public boolean equals(Reservation other){
        return this.name.equals(other.name) && this.dayCount == other.dayCount ;
    }
    public Reservation extend(Reservation other){
        String newName = this.name + " & " + other.name;
        int newDayCount = this.dayCount + other.dayCount;
        return new Reservation(newName , newDayCount);
    }






}
