public class Main {
    public static void main(String [] args){
        Trip trip1 = new Trip("Ankara",5);
        Trip trip2 = new Trip("Konya" , 3);

        System.out.println(trip1);
        System.out.println(trip1.extend(trip2));

        InternationalTrip intTrip = new InternationalTrip("Tokyo", 7,true, "YEN");
        System.out.println(intTrip);

        Reservation res1 = new Reservation("Ali" , 3);
        Reservation res2 = new Reservation("Veli", 2);
        System.out.println(res1);
        System.out.println(res1.extend(res2));

        HotelReservation hotel = new HotelReservation("Ayşe", 4, "Suite", true);
        System.out.println(hotel);

    }
}
