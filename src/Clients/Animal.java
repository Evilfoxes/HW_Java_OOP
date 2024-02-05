package Clients;

import java.time.LocalDate;
public class Animal {

    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;
    protected int movementStatistics;

    public Animal(String nickName, Owner owner, LocalDate date, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
        this.movementStatistics = movementStatistics;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Заболевание"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }
    public LocalDate getDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }
    
    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCycle(){
        wakeUp("12:00");
        eat();
        sleep(movementStatistics);
        toGo(movementStatistics);
        fly(movementStatistics);
        swim(movementStatistics);
    }
    private void wakeUp(String time) {
        System.out.println("Животное" + nickName + "проснулось а " + time);
    }
    public String getType() {
        return getClass().getSimpleName();
    }
    public void eat() {
        System.out.println("Животное" + nickName + "поело");
    }
    public void sleep(int i) {
        System.out.println("Животное" + nickName + "поднималось на " + i);
    }
    public void toGo(int meters) {
        System.out.println("Животное" + nickName + "походилось");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    public void fly(int meters) {
        System.out.println("Животное" + nickName + "прыгалось");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    public void swim(int meters) {
        System.out.println("Животное" + nickName + "плавалось");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s," +
                "Movement statistic = %s", nickName, birthDate, owner, illness, movementStatistics);
    }
}
