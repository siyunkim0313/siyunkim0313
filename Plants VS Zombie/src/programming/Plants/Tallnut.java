package programming.Plants;

import programming.Plants.product.*;

public class Tallnut extends Plant {
	 public Tallnut()
	   {
	      this.attackable = new NoAttack();
	      this.defenceable = new DoubleDefence();
	      this.produceable = new NoProduce();
	   }
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���� ūȣ��~");
	}

}
