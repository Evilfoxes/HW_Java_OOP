package ClinicInfo;

import Clients.Animal;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Personal> personals;
    private List<Animal> animals;
    private List<Nurse> nurses;
    private List<Doctor> doctors;

    public class VetClinic {
        private List<Personal> personals;
        private List<Animal> animals;
        private List<Nurse> nurses;
        private List<Doctor> doctors;

        public VetClinic() {
            this.personals = new ArrayList<>();
            this.animals = new ArrayList<>();
        }
        public List<Personal> getPersonals() {
            return personals;
        }
        public List<Animal> getAnimals() {
            return animals;
        }
        public List<Nurse> getNurses() {
            return nurses;
        }
        public List<Doctor> getDoctors() {
            return doctors;
        }
    }
}
