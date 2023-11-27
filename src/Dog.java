public  class Dog extends Animal {
    int runDistance = 500;
    int swimDistance = 100;

    @Override
    void run(int distance) {
        if (runDistance < distance) {
            System.out.println("Не умеет бегать");
        } else {
            System.out.println("Собака пробежала " + runDistance + "- м");
        }
    }

    @Override
    void swim(int distance) {
        if (swimDistance < distance) {
            System.out.println("Не умеет плавть");
        } else {
            System.out.println("Собака проплыла " + swimDistance + "- м");
        }
    }
}