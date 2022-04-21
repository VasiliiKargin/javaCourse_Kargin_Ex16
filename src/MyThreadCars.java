public class MyThreadCars extends Thread {
    private final Road road;

    public MyThreadCars(Road road) {
        this.road = road;
    }

    @Override
    public void run() {
        road.setCars(0);
        try {
            for (int i = 0; i < 10; i++) {
                synchronized (road) {
                    road.setCars(road.getCars() + 1);
                    //System.out.println("Машин на светофоре - " + road.getCars());
                    road.wait(5000);
                }
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
