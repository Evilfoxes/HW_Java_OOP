package Clients;

import Interface.Flyable;
import Interface.Goable;
import Interface.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Flyable, Goable {
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

//    @Override
//    public void toGo(int meters) {
//        System.out.print("Утка " + nickName + " прошла " + meters + " метров.");
//    }
//    @Override
//    public void eat(int grams) {
//        System.out.print("Утка " + nickName + " поел(а) " + grams + " грамм.");
//    }
//    @Override
//    public void sleep(int time) {
//        System.out.print("Утка " + nickName + " спал(а) " + time + " часов.");
//    }
//    @Override
//    public void fly(int meters) {
//        System.out.print("Утка " + nickName + " пролетел(а) " + meters + " метров");
//    }
//    @Override
//    public void swim(int meters) {
//        System.out.print("Утка " + nickName + " проплыл(а) " + meters + " метров");
//    }

    @Override
    public double fly() {
        return 150;
    }

    @Override
    public double swim() {
        return 100;
    }

    @Override
    public double run() {
        return 3;
    }
}
