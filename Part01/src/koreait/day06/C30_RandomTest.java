package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
//난수 발생하는 Random 클래스의 메소드를 테스트합니다.
	public static void main(String[] args) {
		Random r = new Random(); //Random 클래스의 객체 생성(new 연산)
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(); //int범위내에서 랜덤값(난수) 만듭니다.
			System.out.println(inum);
		}
		
		System.out.println("1. 정수형 랜덤값 10개 출력-bound(경계값)있음.");
		for (int i = 0; i < 10; i++) {
			int inum = r.nextInt(100);
			System.out.println(inum);
		}//경계값은 양수값만 사용합니다.
		
		//n보다 크거나 같고 m보다 작은범위 난수: r.nextInt(m-n)+1
		
		System.out.println("4. 2~45 범위의 값으로 난수 10개");
		for (int j = 0; j < 10; j++) {
			System.out.println(r.nextInt(44)+2);
		}
		}
}
