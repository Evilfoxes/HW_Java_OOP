package Clients;

import java.time.LocalDate;

public class Cat extends Animal {
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }
    public Cat() {
        super();
        this.discount = 10D;
    }
    public Double getDiscount(){
        return discount;
    }
    public void setDiscount(Double discount){
        this.discount = discount;
    }
    public void meow() {
        System.out.println("Мяу");
    }
    public String toString(){
        return super.toString() + "Discount("+discount+")";
    }
    @Override
    public void toGo(int meters) {
        System.out.print("Кот/кошка" + nickName + "прошел" + meters);
    }
    @Override
    public void eat(int grams) {
        System.out.print("Кот/кошка" + nickName + "поел(а)" + grams);
    }
    @Override
    public void sleep(int time) {
        System.out.print("Кот/кошка" + nickName + "спал(а)" + time);
    }

}
