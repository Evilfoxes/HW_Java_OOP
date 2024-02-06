import Clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Кузя", new Owner("Смоляков Дмитрий"),
                LocalDate.of(2019, 07, 12), new Illness("Панлейкопения"));

        Animal dog = new Dog("Арчи", new Owner("Иванов Александр"),
                LocalDate.of(2021, 07, 01), new Illness("Аденовироз"));
            
        Animal duck = new Duck("Чеппи", new Owner("Хорина Татьяна"),
                LocalDate.of(2023, 05, 13), new Illness("Паратиф"));

        System.out.println(cat);
        cat.eat(7);
        cat.toGo(25);
        cat.sleep(7);
        System.out.println("***********");
        System.out.println(dog);
        dog.eat(25);
        dog.toGo(150);
        dog.sleep(10);
        System.out.println("***********");
        System.out.println(duck);
        duck.eat(10);
        duck.toGo(25);
        duck.sleep(5);
        duck.fly(75);
        duck.swim(100);
        System.out.println("***********");
    }

}