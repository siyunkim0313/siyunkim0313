package programming.Plants;

import programming.Plants.product.*;
public class Peashooter extends Plant {

	public Peashooter() {
	      this.attackable = new BeanAttack();
	      this.defenceable = new NoDefence();
	      this.produceable = new NoProduce();
	   }

		public void display() {
			// TODO Auto-generated method stub
			System.out.println("³ª´Â Peashooter~");
		}
}
