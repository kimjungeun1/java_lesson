package koreait.day08;

public class MyClassTest {

		//MyClass1 ��ü ����
	
	//MyClass���� ����Ҽ� �ִ� ����?
	public static void main(String[] args) {
		MyClass1 my = new MyClass1();
//		my.name="momo";
		my.point= 1.234;
//		my.age=23; 
		my.setAge(23);
		System.out.println("age:"+my.getAge());
		my.setAge(-100);
		System.out.println("age="+my.getAge());
//		System.out.println("point="+my.defaultdefaultdefaultdefault);
		
	}
//	���������� �׽�Ʈ�� �ڹٿ��� �����ϴ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���.
}
