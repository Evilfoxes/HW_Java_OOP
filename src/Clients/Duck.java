package Clients;

import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness,
               int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
    }
    public Duck() {
        super();
    }
    public void Krya() {
        System.out.println("Кря");
    }
    @Override
    public void toGo(int meters) {
        System.out.print("Утка" + nickName + "прошла" + meters);
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    @Override
    public void ate(int grams) {
        System.out.print("Утка" + nickName + "поел(а)" + grams);
        int result = movementStatistics = movementStatistics + grams;
        System.out.println(result);
    }
    public void sleep(int time) {
        System.out.print("Утка" + nickName + "спал(а)" + time);
        int result = movementStatistics = movementStatistics + time;
        System.out.println(result);
    }
    public void fly(int time) {
        System.out.print("Утка" + nickName + "пролетел(а)" + time);
        int result = movementStatistics = movementStatistics + time;
        System.out.println(result);
    }
    public void swim(int time) {
        System.out.print("Утка" + nickName + "плавал(а)" + time);
        int result = movementStatistics = movementStatistics + time;
        System.out.println(result);
    }

}
