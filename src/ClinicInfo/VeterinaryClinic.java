package ClinicInfo;

import Clients.Animal;
import Interface.ClinicPersonal;
import Interface.Flyable;
import Interface.Goable;
import Interface.Swimable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VeterinaryClinic {
    private List<Personal> personals;
    private List<Animal> enimals;
    private List<Doctor> doctors;
    private List<Nurse> nurses;

        public VeterinaryClinic() {
            this.personals = new ArrayList<>();
            this.enimals = new ArrayList<>();
        }
        public List<Personal> getPersonal() {
            return personals;
        }
        public List<Animal> getEnimals() {
            return enimals;
        }
        public List<Doctor> getDoctors() {
            return doctors;
        }
        public List<Nurse> getNurses() {
            return nurses;
        }
        public List<Animal> getGoables() {
            List<Animal> goableList = new ArrayList<>();
            for (Animal animal : enimals) {
                if (animal instanceof Goable) {
                    goableList.add(animal);
                }
            }
            return goableList;
        }
        public List<Animal> getSwimables() {
            List<Animal> swimableList = new ArrayList<>();
            for (Animal animal : enimals) {
                if (animal instanceof Swimable) {
                    swimableList.add(animal);
                }
            }
            return swimableList;
        }
        public List<Animal> getFlyables() {
            List<Animal> flyableList = new ArrayList<>();
            for (Animal animal : enimals) {
                if (animal instanceof Flyable) {
                    flyableList.add(animal);
                }
            }
            return flyableList;
        }
    }

