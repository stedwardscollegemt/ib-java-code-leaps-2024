package lesson08;

public class Visits {
    
    private String hotelCode;
    
    private int days;

    public Visits(String h, int d) {
        hotelCode = h;
        days = d;
    }

    // accessor method, this is required
    // to give read access to days which is "hidden"
    public int getDays() {
        return days;
    }
}
