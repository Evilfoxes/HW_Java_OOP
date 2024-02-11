package Drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private Double power;

    public Component(String title, Double weight, Double power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, Power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return this.power.compareTo(o.power);

    }
}
