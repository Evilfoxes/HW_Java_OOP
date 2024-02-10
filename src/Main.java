import Clients.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Кузя", new Owner("Смоляков Дмитрий"),
                LocalDate.of(2019, 07, 12), new Illness("Панлейкопения"));

        Animal dog = new Dog("Арчи", new Owner("Иванов Александр"),
                LocalDate.of(2021, 07, 01), new Illness("Аденовироз"));
            
        Animal duck = new Duck("Чеппи", new Owner("Хорина Татьяна"),
                LocalDate.of(2023, 05, 13), new Illness("Паратиф"));

        Animal fish = new Fish(("Бусинка", new Owner("Васильев Андрей"),
                LocalDate.of(2023, 08, 17), new Illness("Сапролегниоз")));

        System.out.println(cat);
        cat.eat(150);
        System.out.println();
        cat.toGo(25);
        System.out.println();
        cat.sleep(7);
        System.out.println();
        cat.fly(0);
        System.out.println();
        cat.swim(0);
        System.out.println();
        System.out.println("***********");
        System.out.println(dog);
        dog.eat(1000);
        System.out.println();
        dog.toGo(150);
        System.out.println();
        dog.sleep(10);
        System.out.println();
        dog.fly(0);
        System.out.println();
        dog.swim(0);
        System.out.println();
        System.out.println("***********");
        System.out.println(duck);
        duck.eat(100);
        System.out.println();
        duck.toGo(25);
        System.out.println();
        duck.sleep(5);
        System.out.println();
        duck.fly(75);
        System.out.println();
        duck.swim(100);
        System.out.println();
        System.out.println("***********");
    }

}