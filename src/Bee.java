
import java.util.Random;

public class Bee {

	public int randomHealthLevel() {
		Random ran= new Random();
		int min= 0;
		int max= 100;
		return ran.nextInt((max-min)+1)+min;
	}
	
	public int randomStrike() {
		Random ran= new Random();
		int min=0;
		int max=100;
		return ran.nextInt((max-min)+1)+min;
	}
	
	
}
