package programming.Plants;

import programming.Plants.product.*;

public class Sunshroom extends Plant {
	public Sunshroom()
	   {
	      this.attackable = new NoAttack();
	      this.defenceable = new NoDefence();
	      this.produceable = new DoubleProduce();
	   }
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���� �޻� ����~");
	}

}
