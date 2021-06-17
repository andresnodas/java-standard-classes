package programmer.zaman.now.classes;

import java.util.Random;

public class RandomApp {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(random.nextInt(1000));
			//Random data from 0 to 1000
		}
		
	}
	
}
