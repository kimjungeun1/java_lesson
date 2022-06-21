package koreait.day13;

public class c53_InterfaceTest {

	public static void main(String[] args) {
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2= new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3=new MyClassZ();
		
		//참조타입에 따른 메소드 실행(다중 구현체): z1,z1,z3이 어떤 메소드 실행 가능한지?
		z1.methodA();
		z1.methodB(23);
		z1.name("쯔위");

		z2.methodA();
		z2.methodB(23);
//		z2.name("쯔위");//오류: InterfaceB의 추상메소드로 실행 못함
		
//		z3.methodA();// 오류: InterfaceA의 추상메소드로 실행 못함.
//		z3.methodB(23);
		z3.name("쯔위");
		
//		캐스팅: 다중구현체의 인터페이스 타입 캐스팅
		InterfaceB ib = (InterfaceB)z2;
		ib.name("쯔위");
		InterfaceA ia = (InterfaceA)z3;
		ia.methodA();
		
		
		iAmethod(x2);
//		iAmethod(y2);//오류: InterfaceA구현체 아님.
		iAmethod(z2);
		iAmethod(x1);
		iAmethod(z1);
		
		System.out.println();
		iBmethod(y1);
		iBmethod(y2);
		
		iBmethod(z1);
		iBmethod(z3);
		iBmethod(y1);
	
		
		
		
		
		
		
	}
	//다형성 구현에 : 메소드 인자 타입인 InterfaceA
	//		InterfacrA 구현체는 모두 인자로 전달가능.
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
	}
}
