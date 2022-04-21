import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Road road = new Road(0, 0);
        MyThreadPerson per = new MyThreadPerson(road);
        MyThreadCars car = new MyThreadCars(road);
        road.start();
        per.start();
        car.start();
        sleep(30000);
        System.exit(0);
    }
}
