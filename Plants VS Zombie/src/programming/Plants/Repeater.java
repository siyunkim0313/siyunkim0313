package programming.Plants;

import programming.Plants.product.*;

public class Repeater extends Plant {
	
	public Repeater() {
      this.attackable = new DoubleAttack();
      this.defenceable = new NoDefence();
      this.produceable = new NoProduce();
   }

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("³ª´Â Repeater~");
	}

}
