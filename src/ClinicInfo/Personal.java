package ClinicInfo;

import java.time.LocalDate;

public class Personal {
    protected String namePersonal;
    protected LocalDate birthday;
    protected String specialty;

    public Personal(String nameDoctor, LocalDate birthday, String specialty) {
        this.namePersonal = nameDoctor;
        this.birthday = birthday;
        this.specialty = specialty;
    }

    public String getNameDoctor() {
        return namePersonal;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public String getSpecialty() {
        return specialty;
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    @Override
    public String toString() {
        return String.format("nameDoctor = %s, birthday = %s, specialty = %s", namePersonal, birthday, specialty);
    }

}
