package koreait.day10;

public class ConstructorTest {

}



class Product{
	int price;

	//����Ʈ �����ڴ� ������ ���մϴ�.
	public Product(int price) {
		this.price=price;
	}
}

class Food extends Product{

	public Food(int price) {
		super(price);
	}//Product() ����Ʈ ������ �ǻ�-> food()����Ʈ ������ ����

	
	
}

class Electronics extends Product{

	public Electronics(int price) {
		super(price);	//Product()����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
		
	}
	
}



