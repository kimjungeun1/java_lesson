package koreait.day08a;

import koreait.day08.MyClass1;

public class MyClassTest {

		//MyClass1 객체 샐성
	
	//MyClass에서 사용할수 있는 것은?
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
//	접근한정자 테스트는 자바에서 제공하는 클래스들을 이해하고 우리가 만들 클래스에도 사용.
}
