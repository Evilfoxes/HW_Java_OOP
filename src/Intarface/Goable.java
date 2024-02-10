package Intarface;

public interface Goable {
    double run();

    default void defaultGo(double speed) {
        System.out.println("Животное ходит со скоростью " + speed);
    }
}
