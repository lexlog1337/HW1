
public class Cat extends Animal {
    int runDistance = 200;
    int swimDistance = 0;

    @Override
    void swim(int swimDistance) {
        System.out.println("Кошка умеет плавть!!");
    }

    @Override
    void run(int distance) {
        if (runDistance < distance) {
            System.out.println("Не умеет бегать");
        } else {
            System.out.println("Кошка пробежала " + runDistance + "- м");

        }
    }
}