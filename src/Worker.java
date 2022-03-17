import java.util.ArrayList;

public class Worker extends Bee implements BeeInterface {
	ArrayList<Worker> listWorker = new ArrayList<>();

    private int healthPoint;

    public Worker() {
    }

    public Worker(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public void createBeeList() {
        listWorker.clear();  //CLEARS THE LIST SO A NEW LIST CAN E GENERATED EACH TIME THE PROGRAM IS RUN
        System.out.println("List of Worker: ");
        for (int i = 0; i < 10; i++) {
            int point = super.randomHealthLevel();
            listWorker.add(new Worker(point));
            System.out.print(listWorker.get(i).getHealthPoint() + " ");
        }
        System.out.println();   //prints list of 10 bees 
    }

    @Override
    public void damage() {
        for (int i = 0; i < 10; i++) {
            int point = super.randomStrike();
            listWorker.get(i).setHealthPoint(listWorker.get(i).getHealthPoint()
                    - point);
            int currentPoint = listWorker.get(i).getHealthPoint();
            if (currentPoint < 0) {
                currentPoint = 0;
            }
            System.out.print(currentPoint + " ");
            if (currentPoint < 70) {
                System.out.println("dead");
            } else {
                System.out.println("alive");
            }
        }
    }

    public void setListWorker(ArrayList<Worker> listWorker) {
        this.listWorker = listWorker;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

}
