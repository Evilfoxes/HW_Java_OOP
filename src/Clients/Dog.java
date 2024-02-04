package Clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness,
               int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }
    public Dog() {
        super();
    }
    public void gav() {
        System.out.println("Гав");
    }
}
