package Drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Component[] components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { // Anonime class
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    public void addComponents(Component penicillin, Component water) {
    }
}
