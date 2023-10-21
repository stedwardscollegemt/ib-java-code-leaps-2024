package topicDlearningaids.medicentre;

import java.time.LocalDate;

public class Appointment {

    // Attributes
    String appointmentId;

    Patient patient;

    LocalDate date;

    // Appointment behaviour
    public boolean isNextDay() {
        return true;
    }
}
