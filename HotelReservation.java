public class HotelReservation extends Reservation {
    private String roomType;
    private boolean breakFastIncluded;

    public HotelReservation(String name, int dayCount, String roomType, boolean breakFastIncluded ) {
        super(name, dayCount);
        this.roomType = roomType;
        this.breakFastIncluded = breakFastIncluded;

    }

    public String toString(){
        return super.toString() + "\n Room type: " + roomType +
                "\n Breakfast Included: " + breakFastIncluded;

    }
    public boolean equals(HotelReservation other){
        return super.equals(other) &&
                this.roomType.equals(other.roomType) &&
                this.breakFastIncluded == other.breakFastIncluded;
    }

    public HotelReservation extend (Reservation other) {
        String newName = this.getName() + " & " + other.getName();
        int newDayCount = this.getDayCount() + other.getDayCount();
        return new HotelReservation(newName,newDayCount,this.roomType,this.breakFastIncluded);
    }









}
