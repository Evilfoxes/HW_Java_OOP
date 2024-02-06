package Clients;

import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
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
    }
    @Override
    public void eat(int grams) {
        System.out.print("Утка" + nickName + "поел(а)" + grams);
    }
    @Override
    public void sleep(int time) {
        System.out.print("Утка" + nickName + "спал(а)" + time);
    }
    @Override
    public void fly(int time) {
        System.out.print("Утка" + nickName + "пролетел(а)" + time);
    }
    @Override
    public void swim(int time) {
        System.out.print("Утка" + nickName + "плавал(а)" + time);
    }

}
