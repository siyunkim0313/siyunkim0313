package programming.Plants;

import programming.Plants.product.*;


public class Sunflower extends Plant {

	   public Sunflower()
	   {
	      this.attackable = new NoAttack();
	      this.defenceable = new NoDefence();
	      this.produceable = new Produce();
	   }
	   
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���� �عٶ��~");
	}

}
