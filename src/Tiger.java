public class Tiger extends Animal{
    int runDistance = 1000;
    int swimDistance = 600;
    @Override
    void run(int distance) {
        if (runDistance < distance){
            System.out.println("Не умеет бегать");
        }else {
            System.out.println("Tiger is run");
        }
    }

    @Override
    void swim(int distance) {
        if (swimDistance < distance){
            System.out.println("Не умеет плавать");
        }else {
            System.out.println("Tiger is swim");
        }
    }
}
