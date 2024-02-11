package Drugstore;

import Drugstore.components.Azitronite;
import Drugstore.components.Penicillin;
import Drugstore.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("Penicillin",  1.5D, 20);


        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(penicillin, water);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(penicillin, azitronite);

        List<Component> components = new ArrayList<Component>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components);
        System.out.println(components);


//        Iterator<Component> iterator1 = p1;
//
//        while (iterator1.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        for (Component c: p2) {
//            System.out.println(c);
//        }
    }
}
