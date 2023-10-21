package topicDlearningaids.medicentre;

import java.util.ArrayList;

/**
 * A scenario inspired by May 2018 Paper 1 SL Question 10.
 */
public class MedicalCentreMain {

    public static ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    public static void main(String[] args) {

    }

    public static void init() {
        AppointmentsFile appointmentsFile = new AppointmentsFile();
        appointments = appointmentsFile.all();
    }

    public static ArrayList<Appointment> appointmentsNextDay() {
        ArrayList<Appointment> nextDay = new ArrayList<Appointment>();
        for (Appointment appointment : appointments) {
            if (appointment.isNextDay()) {
                nextDay.add(appointment);
            }
        }
        return nextDay;
    }
}
