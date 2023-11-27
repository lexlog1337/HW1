public class Panda extends Animal{
    int runDistance = 50;
    int swimDistance = 10;
    @Override
    void run(int distance) {
        if (runDistance < distance){
            System.out.println("Не умеет бегать");
        }else {
            System.out.println("Panda is run");
        }
    }

    @Override
    void swim(int distance) {
        if (swimDistance < distance){
            System.out.println("Не умеет плавать");
        }else {
            System.out.println("Panda is swim");
        }
    }
}
