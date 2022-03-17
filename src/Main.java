
public class Main {

	public static void main(String[]args) {
		Worker worker= new Worker();
		worker.createBeeList();
		worker.damage();
		
		Queen queen = new Queen();
		queen.createBeeList();
		queen.damage();
		
		Drone drone= new Drone();
		drone.createBeeList();
		drone.damage();
		
	}
	
	
}
