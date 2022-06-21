package koreait.test;

public abstract class Product {
protected int price;
protected String prdName;
	
	public abstract String sell(Object obj) ;
}
//자식 객체타입 검사ㅣ instanceOf,다운캐스팅
//메소드 정의: 리턴값 형식, 인자(매개변수)의 타입과 개수
