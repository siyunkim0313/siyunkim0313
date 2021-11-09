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
			System.out.println("ȣ���� ��Ƽ�����ϴ�. ���� �ǵ�: " + this.health);
		} else if (this.health == 0) {
			System.out.println("ȣ���� ��������ϴ�.");
		} else {
			System.out.println("ȣ���� ���尡 �� �����Ǿ� �Ĺ����� Ÿ���� ���ϴ�.");
			this.component.takeDamage(-this.health);
		}
	}

}
