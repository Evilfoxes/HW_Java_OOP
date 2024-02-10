package ClinicInfo;

import Clients.Animal;
import Clients.Illness;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

public class Nurse extends Personal{
    protected int nurseId;
    public Nurse(String nameDoctor, LocalDate birthday, String specialty, int nurseId) {
        super(nameDoctor, birthday, specialty);
        this.nurseId = nurseId;
    }
    public Map<Integer, String> procedure = Map.of(1,"Укол", 2, "Витамины");

    public String getProcedure(Animal animal) {
        Random rnd = new Random();
        int random = rnd.nextInt(procedure.size());
        String proc = procedure.get(random);
        return proc;
    }

    @Override
    public String toString() {
        return String.format("nameDoctor = %s, birthday = %s, specialty = %s, nurseId = %s",
                namePersonal, birthday, specialty, nurseId);
    }
}
