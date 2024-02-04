package Clients;

import java.time.LocalDate;

public class Cat extends Animal {
    double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness,
               Double discount, int movementStatistics) {
        super(nickName, owner, birthDate, illness, movementStatistics);
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
        int result = movementStatistics = movementStatistics + meters;
        System.out.println(result);
    }
    @Override
    public void ate(int grams) {
        System.out.print("Кот/кошка" + nickName + "поел(а)" + grams);
        int result = movementStatistics = movementStatistics + grams;
        System.out.println(result);
    }
    public void sleep(int time) {
        System.out.print("Кот/кошка" + nickName + "спал(а)" + time);
        int result = movementStatistics = movementStatistics + time;
        System.out.println(result);
    }

}
