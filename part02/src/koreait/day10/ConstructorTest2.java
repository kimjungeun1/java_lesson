package koreait.day10;

public class ConstructorTest2 {

}



class Product2{
	int price;
	
	//����Ʈ �����ڴ� ������ ���մϴ�.
	public Product2(int price) {
		this.price=price;
	}
}

class Food2 extends Product2{

	public Food2(int price) {
		super(price);
	}

		//Product() ����Ʈ ������ �ǻ�-> food()����Ʈ ������ ����

	
	
}

class Electronics2 extends Product2{

	public Electronics2(int price) {
		super(price);
	} //Product()����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
		
	}
	




