package koreait.day11.test;



public class AnimalTest5 {

	public static void main(String[] args) {
		long end=System.currentTimeMillis();
		System.out.println(end);
	}
	
}


class Frog extends Animal{	//������

	protected String mouth;  //����Ʈ ������+�ٸ���Ű�� �ڽ�Ŭ����
	public Frog() {
		System.out.println("���ο� ���������� Frog");
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	}
	
	//������ ���� : �޼ҵ� �������̵�    				*��: �����ε�(overloading) - ���� ã�ƺ���*
	//				�� �θ� Ŭ������ �޼ҵ带 ������. �̶� ���ڿ� ����Ÿ���� �����ϰ� �մϴ�.
	@Override		//annotation �ֳ����̼� : �ڵ�(�Ǵ� ����) �Ҷ� ���� �Ǵ� �ּ�
	public void act() {		
//			super.act();	//�θ�Ŭ������ act() ����
			System.out.println("Animal �ൿ : ���÷� �����ϱ� ");
	}
}
class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("���ο� ���������� cat" );
	}
	public void sound() {
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿˾߿� ��� ");
	}
}