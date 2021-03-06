
import java.util.ArrayList;

public class Drone extends Bee implements BeeInterface {
     ArrayList<Drone>listDrone= new ArrayList<>();
     private int healthPoint;
     public Drone() {  	 
     }
	
     public Drone(int healthPoint) {
    	 this.healthPoint= healthPoint;
     }

	@Override
	public void createBeeList() {
		// TODO Auto-generated method stub
		listDrone.clear();
		System.out.println("List Drone: ");
		 for (int i = 0; i < 10; i++) {
	            int point = super.randomHealthLevel();
	            listDrone.add(new Drone(point));
	            System.out.print(listDrone.get(i).getHealthPoint() + " ");
	        }
	        System.out.println();
	}

	

	@Override
	public void damage() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
            int point = super.randomStrike();
            listDrone.get(i).setHealthPoint(listDrone.get(i).getHealthPoint()
                    - point);
            int currentPoint = listDrone.get(i).getHealthPoint();
            if (currentPoint < 0) {
                currentPoint = 0;
            }
            System.out.print(currentPoint + " ");
            if (currentPoint < 50) {
                System.out.println("dead");
            } else {
                System.out.println("alive");
            }
		}   
	}
		
		 public void setListDrone(ArrayList<Drone> listDrone) {
		        this.listDrone = listDrone;
		    }

		    public int getHealthPoint() {
		        return healthPoint;
		    }

		    public void setHealthPoint(int healthPoint) {
		        this.healthPoint = healthPoint;
		    }
	
}
