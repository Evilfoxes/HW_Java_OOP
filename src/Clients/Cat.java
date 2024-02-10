package Clients;

import Interface.Goable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

//    @Override
//    public void toGo(int meters) {
//        System.out.print("Кот/кошка " + nickName + " прошел(шла) " + meters + " метров. ");
//    }
//    @Override
//    public void eat(int grams) {
//        System.out.print("Кот/кошка " + nickName + " поел(а) " + grams + " грамм. ");
//    }
//    @Override
//    public void sleep(int time) {
//        System.out.print("Кот/кошка " + nickName + " спал(а) " + time + " часов. ");
//    }
//    @Override
//    public void fly(int meters) {
//        System.out.print("Кот/кошка "+ nickName + " пролетел(а) " + meters + " метров! Потому что кошки не умеют летать!");
//    }
//    @Override
//    public void swim(int meters) {
//        System.out.print("Кот/кошка " + nickName + " проплыл(а) " + meters + " метров! Кошки конечно же умеют плавать, " +
//                "но не очень любят воду.");
//    }

    @Override
    public double run() {
        return 8;
    }
}
