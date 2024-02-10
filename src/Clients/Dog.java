package Clients;

import Interface.Goable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

//    @Override
//    public void toGo(int meters) {
//        System.out.print("Собака" + nickName + "прошла" + meters);
//    }
//    @Override
//    public void eat(int grams) {
//        System.out.print("Собака " + nickName + " поел(а) " + grams + " грамм.");
//    }
//    @Override
//    public void sleep(int time) {
//        System.out.print("Собака " + nickName + " спал(а) " + time + " часов.");
//    }
//    @Override
//    public void fly(int meters) {
//        System.out.print("Собака " + nickName + " пролетел(а) " + meters + "! Потому что собаки не умеют летать!");
//    }
//    @Override
//    public void swim(int meters) {
//        System.out.print("Собака " + nickName + " проплыл(а) " + meters + "! Собаки конечно же умеют плавать, " +
//                "но в этом нет необходимости.");
//    }

    @Override
    public double run() {
        return 7;
    }
}
