public class MyThreadPerson extends Thread {
    private final Road road;

    public MyThreadPerson(Road road) {
        this.road = road;
    }

    @Override
    public void run() {
        road.setPerson(0);
        try {
            for (int i = 0; i < 10; i++) {
                synchronized (road) {
                    road.setPerson(road.getPerson() + 1);
                    //System.out.println("Людей на светофоре - " + road.getPerson());
                    road.wait(2000);
                }
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
