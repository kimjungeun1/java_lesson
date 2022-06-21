package koreait.test;

public class MainTest {
public static void main(String[] args) {
	Product[]cart=new Product[5];
	cart[0]=new Bike(123000, "MTB", 25);
	cart[3]=new Bike(99000, "»ïÃµ¸®", 15);
	
	for (Product i : cart) {
		if(i!=null&&i.price>100000)
			System.out.println(i.toString());
	}
	Bike bike = new Bike();
	System.out.println(bike.sell(20));
}
}
