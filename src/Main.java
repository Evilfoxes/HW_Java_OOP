import Clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Кузя", new Owner("Смоляков Дмитрий"),
                LocalDate.of(2019, 7, 12), new Illness("Панлейкопения"));

        Animal dog = new Dog("Арчи", new Owner("Иванов Александр"),
                LocalDate.of(2021, 7, 1), new Illness("Аденовироз"));

        Animal duck = new Duck("Чеппи", new Owner("Хорина Татьяна"),
                LocalDate.of(2023, 5, 13), new Illness("Паратиф"));

        Animal fish = new Fish(("Бусинка"), new Owner("Васильев Андрей"),
                LocalDate.of(2023, 8, 17), new Illness("Сапролегниоз"));

        Animal gull = new Gull(("Чарли"), new Owner("Семёнов Семён"),
                LocalDate.of(2020, 3, 23), new Illness("Перелом крыла"));

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(fish);
        animals.add(gull);
//        System.out.println(cat);
//        System.out.println(dog);
//        System.out.println(duck);
//        System.out.println(fish);
//        System.out.println(gull);


//        System.out.println(cat);
//        cat.eat(150);
//        System.out.println();
//        cat.toGo(25);
//        System.out.println();
//        cat.sleep(7);
//        System.out.println();
//        cat.fly(0);
//        System.out.println();
//        cat.swim(0);
//        System.out.println();
//        System.out.println("***********");
//        System.out.println(dog);
//        dog.eat(1000);
//        System.out.println();
//        dog.toGo(150);
//        System.out.println();
//        dog.sleep(10);
//        System.out.println();
//        dog.fly(0);
//        System.out.println();
//        dog.swim(0);
//        System.out.println();
//        System.out.println("***********");
//        System.out.println(duck);
//        duck.eat(100);
//        System.out.println();
//        duck.toGo(25);
//        System.out.println();
//        duck.sleep(5);
//        System.out.println();
//        duck.fly(75);
//        System.out.println();
//        duck.swim(100);
//        System.out.println();
//        System.out.println("***********");


    }

}