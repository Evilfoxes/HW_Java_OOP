package ClinicInfo;

import Clients.Animal;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

public class Doctor extends Personal{
    protected int doctorId;
    public Doctor(String nameDoctor, LocalDate birthday, String specialty, int doctorId) {
        super(nameDoctor, birthday, specialty);
        this.doctorId = doctorId;
    }
    public int getDoctorId() {
        return doctorId;
    }
    public Map<Integer, String> diagnos = Map.of(1,"Болен", 2, "Здоров");

    public String getDiagnos(Animal animal) {
        Random rnd = new Random();
        int random = rnd.nextInt(diagnos.size());
        String diag = diagnos.get(random);
        return diag;
    }

    @Override
    public String toString() {
        return String.format("nameDoctor = %s, birthday = %s, specialty = %s, doctorId = %s",
                namePersonal, birthday, specialty, doctorId);
    }
}
