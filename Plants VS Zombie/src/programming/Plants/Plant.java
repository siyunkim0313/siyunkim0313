package programming.Plants;

import programming.Plants.*;
import programming.Plants.product.*;


public abstract class Plant extends Component{
	
	   protected Attackable attackable;
	   protected Defenceable defenceable;
	   protected Produceable produceable;
	   
	   public Plant() {
		   this.health = 100;
	   }
	      
	   public void product() {
	      this.attackable.attact();
	      this.defenceable.defence();
	      this.produceable.produce();
	   }
	   
	@Override
	public void takeDamage(int num) {
		// TODO Auto-generated method stub
		this.health -= num;
		System.out.println("현재 식물의 체력: " + this.health);
		
	}

	public abstract void display();
}
