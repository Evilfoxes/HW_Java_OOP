package Interface;

public interface Flyable {
    double fly();
    default void defaultFly(double speed) {
        System.out.println("Животное летает со скоростью" + speed);
    }
}
