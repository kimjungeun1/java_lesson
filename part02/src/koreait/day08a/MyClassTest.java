package koreait.day08a;

import koreait.day08.MyClass1;

public class MyClassTest {

		//MyClass1 ��ü ����
	
	//MyClass���� ����Ҽ� �ִ� ����?
	public static void main(String[] args) {
		
		MyClass1 my = new MyClass1();
		my.setName("momo");
		my.point= 1.234;
//		my.age=23; 
		my.setAge(23);
		System.out.println("age:"+my.getAge());
		my.setAge(-100);
		System.out.println("age="+my.getAge());
		System.out.println("point="+my.point);
		System.out.println("name="+my.getName());
		
	}
//	���������� �׽�Ʈ�� �ڹٿ��� �����ϴ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���.
}
