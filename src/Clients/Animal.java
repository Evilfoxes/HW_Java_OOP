package Clients;

import java.time.LocalDate;
public class Animal {

    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;
//    protected int movementStatistics;

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
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
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }
    
    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCycle(){
        wakeUp("08:00");
        eat();
        sleep();
        toGo();
        fly();
        swim();
    }
    private void wakeUp() {
        wakeUp("08:00");
    }

    private void eat() {
        System.out.println("Животное " + nickName + " съело корма");
    }

    private void sleep() {
        System.out.println("Животное " + nickName + " спал(а)");
    }

    private void toGo() {
        System.out.println("Животное " + nickName + " прошел(шла)");
    }

    private void fly() {
        System.out.println("Животное " + nickName + " пролетел(а)");
    }

    private void swim() {
        System.out.println("Животное " + nickName + " проплыл(а)");
    }

    private void wakeUp(String time) {
        System.out.println("Животное" + nickName + "поднималось на " + time);
    }
    public String getType() {
        return getClass().getSimpleName();
    }
    public void eat(int grams) {
        System.out.println("Животное " + nickName + " съело " + grams + " грамм корма");
    }
    public void sleep(int time) {
        System.out.println("Животное " + nickName + " спал(а) " + time + " часов");
    }
    public void toGo(int meters) {
        System.out.println("Животное " + nickName + " прошел(шла) " + meters + " метров");
    }
    public void fly(int meters) {
        System.out.println("Животное " + nickName + " пролетел(а)" + meters + " метров");
    }
    public void swim(int meters) {
        System.out.println("Животное " + nickName + " проплыл(а)" + meters + " метров");
    }
    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}
