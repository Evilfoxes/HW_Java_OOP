package main.clients;

import java.time.LocalDate;
public class Animal {

    protected String nickName;
    protected Owner owner;
    protected LocalDate date;
    protected Illness illness;

    protected int movementStatistics;

    public Animal(String nickName, Owner owner, LocalDate date, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.date = date;
        this.illness = illness;
        this.movementStatistics = movementStatistics;
    }
    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(),
                new Illness("Заболевание"), 0);
    }
    public String getNickName() {
        return nickName;
    }
    public Owner getOwner() {
        return owner;
    }
    public LocalDate getDate() {
        return date;
    }
    public Illness getIllness() {
        return illness;
    }
    public void setIllness(Illness illness) {
        this.illness = illness;
    }
    public void lifeCycle(){
        wakeUp();
        ate();
        sleep();
        toGo();
        fly();
        swim();
    }
    private void wakeUp(String time) {
        System.out.println("Животное" + nickName + "проснулось а " + time);
    }
    public String getType() {
        return getClass().getSimpleName();
    }
    private void ate() {
        System.out.println("Животное" + nickName + "поело");
    }
    private void sleep(String time) {
        System.out.println("Животное" + nickName + "поднималось на " + time);
    }
    private void toGo() {
        System.out.println("Животное" + nickName + "походилось");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    private void fly() {
        System.out.println("Животное" + nickName + "прыгалось");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    private void swim() {
        System.out.println("Животное" + nickName + "плавалось");
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s," +
                "Movement statistic = %s", nickName, birtDate, owner, illness, movementStatistics);
    }
}
