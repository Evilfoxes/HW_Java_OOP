package Drugstore;

import Drugstore.components.Azitronite;
import Drugstore.components.Penicillin;
import Drugstore.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin",  1.5D, 20);


        Pharmacy2 pharmacy1 = new Pharmacy2();
        pharmacy1.addComponents(water, azitronite);

        Pharmacy2 pharmacy2 = new Pharmacy2();
        pharmacy2.addComponents(penicillin, water);

        Pharmacy2 pharmacy3 = new Pharmacy2();
        pharmacy3.addComponents(penicillin, azitronite);

        Pharmacy2 pharmacy4 = new Pharmacy2();
        pharmacy4.addComponents(penicillin, azitronite, water);

        Pharmacy2 pharmacy5 = new Pharmacy2();
        pharmacy5.addComponents(penicillin, azitronite, water, penicillin);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);
    }
}
