import Clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Кузя", new Owner("Смоляков Дмитрий"),
                LocalDate.of(2019, 07, 12), new Illness("Панлейкопения")) {
            @Override
            public void eat(int grams) {

            }
        };

        Animal dog = new Animal("Арчи", new Owner("Иванов Александр"),
                LocalDate.of(2021, 07, 01), new Illness("Аденовироз")) {
            @Override
            public void eat(int grams) {

            }
        };
            
        Animal duck = new Animal("Чеппи", new Owner("Хорина Татьяна"),
                LocalDate.of(2023, 05, 13), new Illness("Паратиф")) {
            @Override
            public void eat(int grams) {

            }
        };

        System.out.println(cat);
        cat.toGo(10);
        cat.eat();
        cat.sleep(5);
        System.out.println();
        System.out.println("----------");

        System.out.println(dog);
        dog.toGo(10);
        dog.eat();
        dog.sleep(5);
        System.out.println();
        System.out.println("----------");

        System.out.println(duck);
        duck.toGo(10);
        duck.eat();
        duck.sleep(5);
        duck.fly(15);
        duck.swim(25);
        System.out.println();
        System.out.println("----------");
    }

}