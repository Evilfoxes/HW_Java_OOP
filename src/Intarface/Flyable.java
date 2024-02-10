package Intarface;

public interface Flyable {
    double fly();
    default void defaultFly(double speed) {
        System.out.println("Животное летает с о скоростью" + speed);
    }
}
