package Clients;

import Intarface.Swimable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness){
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public double swim() {
        return 13;
    }
}
