package programming.Plants;

import programming.Plants.Peashooter;
import programming.Plants.Sunflower;
import programming.Plants.Sunshroom;
import programming.Plants.Wallnut;
import programming.Plants.Tallnut;
import programming.Plants.Repeater;

public class SimplePlants {
	
	public static Plant createPlant(String name) {
		Plant plant = null;
		
		if(name.equals("peashooter")) {
			plant = new Peashooter();
		}
		else if(name.equals("sunflower")) {
			plant = new Sunflower();
		}
		else if(name.equals("sunshroom")) {
			plant = new Sunshroom();
		}
		else if(name.equals("wallnut")) {
			plant = new Wallnut();
		}
		else if(name.equals("tallnut")) {
			plant = new Tallnut();
		}
		else if(name.equals("repeater")) {
			plant = new Repeater();
		}
		
		return plant;
		
	}
}
