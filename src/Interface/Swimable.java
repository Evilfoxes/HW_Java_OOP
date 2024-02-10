package Interface;

public interface Swimable {
    double swim();
    default void defaultSwim(double speed) {
        System.out.println("Животное плавает с скоростью " + speed);
    }
}
