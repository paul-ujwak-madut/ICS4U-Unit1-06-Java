import java.util.concurrent.ThreadLocalRandom;

public class dice {
	public static void Rolldie() {
    	int randInt = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    	System.out.println(randInt);
    		}
    	}