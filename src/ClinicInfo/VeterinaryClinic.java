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
    private List<Objects> personalsList;
    private String name;

        public VeterinaryClinic(String name, List<Objects>, personalsList) {
            this.name = name;
            this.personalsList = personalsList;
        }
        public String getName() {
            return name;
        }
        public List<Objects> getPersonals() {
            return personalsList;

        }
        @Override
        public String toString() {
            return String.format("name = %s, personals = %s", name, personalsList);
        }
        static void printPersonal(List<ClinicPesonal> personalList) {
            for (Objects personal : personalList) {
                System.out.println(personal);
            }
        }
        static void getDoctors(List<ClinicPersonal> personalList) {
            for (Objects doctor : personalList) {
                if (doctor instanceof Doctor){
                    System.out.println(doctor);
                }
            }
        }
        static void getNurses(List<ClinicPersonal> personalList) {
            for (Objects nurse : personalList) {
                if (nurse instanceof Nurse){
                    System.out.println(nurse);
                }
            }
        }
        public void printAnimalList(List<Animal> list) {
            for (Animal animal : list) {
                System.out.println(animal);
            }
        }
        public void getGoable(List<Animal> animalList) {
            Animal animal;
            for (int i = 0; i < animalList.size(); i++) {
                animal = animalList.get(i);
                if (animal instanceof Goable) {
                    System.out.println(animal);
                }
            }
        }
        public void getSwimable(List<Animal> animalList) {
            Animal animal;
            for (int i = 0; i < animalList.size(); i++) {
                animal = animalList.get(i);
                if (animal instanceof Swimable) {
                    System.out.println(animal);
                }
            }
        }
        public void getFlyable(List<Animal> animalList) {
            Animal animal;
            for (int i = 0; i < animalList.size(); i++) {
                animal = animalList.get(i);
                if (animal instanceof Flyable) {
                    System.out.println(animal);
                }
            }
        }
    }

