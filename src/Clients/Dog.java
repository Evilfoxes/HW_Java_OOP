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
    public void toGo(int meters) {
        System.out.print("Собака" + nickName + "прошла" + meters);
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    public void ate(int grams) {
        System.out.print("Собака" + nickName + "поел(а)" + grams);
        int result = movementStatistics = movementStatistics + grams;
        System.out.println(result);
    }
    public void sleep(int time) {
        System.out.print("Собака" + nickName + "спал(а)" + time);
        int result = movementStatistics = movementStatistics + time;
        System.out.println(result);
    }
}
