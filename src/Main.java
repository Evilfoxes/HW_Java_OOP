package main;

import main.clients.*
import Clients.Animal;
import Clients.Illness;
import Clients.Owner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    }

    Animal cat = new Animal("Кузя", new Owner("Смоляков Дмитрий"),
            LocalDate.of(2019,08,12), new Illness("Панлейкопения"));
    Animal dog = new Animal("Арчи", new Owner("Иванов Александр"),
            LocalDate.of(2021,07,01), new Illness("Аденовироз"));

    Animal duck = new Animal("Чеппи", new Owner("Хорина Татьяна"),
            LocalDate.of(2023,05,13), new Illness("Паратиф"));

    private class LocalDate {
    }
    System.out.println(cat);
    cat.toGo(10);
    cat.ate(3)
    cat.sleep(10)
    System.out.println();
    System.out.println("---------");
    System.out.println(dog);
    dog.toGo(10);
    dog.ate(3);
    dog.sleep(10);
    System.out.println();
    System.out.println("---------");
    System.out.println(Duck);
    duck.toGo(10);
    duck.ate(3);
    duck.sleep(10);
    duck.fly(15);
    duck.swim(25);
    System.out.println();
    System.out.println("---------");


}