package koreait.day10;

public class ConstructorTest2 {

}



class Product2{
	int price;
	
	//디폴트 생성자는 동작을 안합니다.
	public Product2(int price) {
		this.price=price;
	}
}

class Food2 extends Product2{

	public Food2(int price) {
		super(price);
	}

		//Product() 디폴트 생성자 실생-> food()디폴트 생성자 실행

	
	
}

class Electronics2 extends Product2{

	public Electronics2(int price) {
		super(price);
	} //Product()디폴트 생성자 대신에 커스텀 생성자 호출
		
	}
	




