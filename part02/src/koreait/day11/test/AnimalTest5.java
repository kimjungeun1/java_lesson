package koreait.day11.test;



public class AnimalTest5 {

	public static void main(String[] args) {
		long end=System.currentTimeMillis();
		System.out.println(end);
	}
	
}


class Frog extends Animal{	//개구리

	protected String mouth;  //디폴트 한정자+다른패키지 자식클래스
	public Frog() {
		System.out.println("새로운 동물가족은 Frog");
	}
	
	public void jump() {
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	}
	
	//다형성 구현 : 메소드 오버라이드    				*비교: 오버로딩(overloading) - 각자 찾아보기*
	//				ㄴ 부모 클래스의 메소드를 재정의. 이때 인자와 리턴타입은 동일하게 합니다.
	@Override		//annotation 애너테이션 : 코딩(또는 실행) 할때 참고가 되는 주석
	public void act() {		
//			super.act();	//부모클래스의 act() 실행
			System.out.println("Animal 행동 : 수시로 점핑하기 ");
	}
}
class Cat extends Animal{
	protected String eyes;
	public Cat() {
		System.out.println("새로운 동물가족은 cat" );
	}
	public void sound() {
		setName("고양이");
		setColor("화이트");
		System.out.println("특징 : 야옹야옹");
	}
	@Override
	public void act() {
		System.out.println("Animal 행동 : 수시로 야옹야옹 울기 ");
	}
}