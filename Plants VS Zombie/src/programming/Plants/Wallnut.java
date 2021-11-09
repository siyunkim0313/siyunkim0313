package programming.Plants;

import programming.Plants.product.*;


public class Wallnut extends Plant {

	   public Wallnut()
	   {
	      this.attackable = new NoAttack();
	      this.defenceable = new Defence();
	      this.produceable = new NoProduce();
	   }
	   
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("나는 호두~");
	}

}
