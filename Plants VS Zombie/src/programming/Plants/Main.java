package programming.Plants;

public class Main {
	
	public static void main(String[] args) {
		Component plant = new Pumpkin(new Peashooter());
		plant.takeDamage(120);
	}
}
