package programming.Plants;

public class Pumpkin extends Decorator {
	
	public Pumpkin(Component component) {
		super(component);
		this.health = 100;
	}
	
	@Override
	public void takeDamage(int num) {
		// TODO Auto-generated method stub
		this.health -= num;
		if(this.health > 0) {
			System.out.println("호박이 버티었습니다. 남은 실드: " + this.health);
		} else if (this.health == 0) {
			System.out.println("호박이 사라졌습니다.");
		} else {
			System.out.println("호박의 쉴드가 다 소진되어 식물에게 타격이 갑니다.");
			this.component.takeDamage(-this.health);
		}
	}

}
