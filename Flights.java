public class Flights {
    private String flightnumber;
    private String origin;
    private String destination;
    private double DepartureTime;

    public Flights (String flightnumber, String origin, String destination, double DepartureTime) {
        this.flightnumber=flightnumber;
        this.origin=origin;
        this.destination=destination;
        this.DepartureTime =DepartureTime;

    }
    public void displayDetails() {
        System.out.println("number of the flight : " + flightnumber);
        System.out.println("Place of the origin : " + origin);
        System.out.println("Place of the destinantion : " + destination);
        System.out.println("Time of Department : " + DepartureTime);
    }
}
 class BusinessClassFlight extends Flights {
    private int SeatsAvailable;
    private String aminities;
    
    public BusinessClassFlight (String flightnumber, String origin, String destination, double DepartureTime) {
            super(flightnumber, origin, destination, DepartureTime);
            this.SeatsAvailable=SeatsAvailable;
            this.aminities=aminities;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats available : " + SeatsAvailable);
        System.out.println("Peraks Available on the Flight : " + aminities);
    }
    public static void main(String[] args) {
        BusinessClassFlight businessClassFlight = new BusinessClassFlight("AIRBUS1001", "India", "London", 2.00);

        businessClassFlight.displayDetails();
    }
 }