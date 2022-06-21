package koreait.day10;

public class ConstructorTest {

}



class Product{
	int price;

	//디폴트 생성자는 동작을 안합니다.
	public Product(int price) {
		this.price=price;
	}
}

class Food extends Product{

	public Food(int price) {
		super(price);
	}//Product() 디폴트 생성자 실생-> food()디폴트 생성자 실행

	
	
}

class Electronics extends Product{

	public Electronics(int price) {
		super(price);	//Product()디폴트 생성자 대신에 커스텀 생성자 호출
		
	}
	
}



