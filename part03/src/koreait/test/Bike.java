package koreait.test;

public class Bike extends Product{

	@Override
	public String sell(Object obj) {
	
		return String.format("추가 할인 행사 - %d%% 인하", obj);
	}
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Bike() {}
	public Bike(int price,String prdName,int speed) {
		this.prdName=prdName;
		this.price=price;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}


	
	
	
}
