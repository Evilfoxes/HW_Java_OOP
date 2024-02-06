package Clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Dog() {
        super();
    }
    public void gav() {

        System.out.println("Гав");
    }
    @Override
    public void toGo(int meters) {
        System.out.print("Собака" + nickName + "прошла" + meters);
    }
    @Override
    public void eat(int grams) {
        System.out.print("Собака" + nickName + "поел(а)" + grams);
    }
    @Override
    public void sleep(int time) {
        System.out.print("Собака" + nickName + "спал(а)" + time);
    }
}
