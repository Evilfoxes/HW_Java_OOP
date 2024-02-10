package Clients;

import Intarface.Flyable;
import Intarface.Goable;
import Intarface.Swimable;

import java.time.LocalDate;

public class Gull extends Animal implements Swimable, Flyable, Goable {
    public Gull(String nickName, Owner owner, LocalDate birthDate, Illness illness){
        super(nickName, owner, birthDate, illness);
    }


    @Override
    public double fly() {
        return 100;
    }

    @Override
    public double run() {
        return 5;
    }

    @Override
    public double swim() {
        return 50;
    }
}
