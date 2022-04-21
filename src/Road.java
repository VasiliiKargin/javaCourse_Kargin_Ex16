public class Road extends Thread {
    private int person;
    private int cars;

    public Road(int person, int cars) {
        this.person = person;
        this.cars = cars;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (getPerson() > 4) {
                    setPerson(0);
                    System.out.println("Светофор для пешеходов включен");
                }
                if (getCars() > 3) {
                    setCars(0);
                    System.out.println("Светофор для машин включен");
                }
            }
        }
    }
}
