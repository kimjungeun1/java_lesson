package koreait.day15;

import java.util.Scanner;


//Trowable 클래스의 하위 클래스
//:Error-> 개발중인 프로그램 외부의 문제. 시스템상의 오류.(HW,Os,JVM>>>
//Exception: 개발중인 프로그램 관련된 문제
public class C62_Exception {

	public static void main(String[] args) {
//		int a = 4.12 //문법오류

		        //Exception 예시1:NullPointerException (객체 참조가 Null이면 메소드 실행 못합니다.)
				String message = null;
				
				char temp = message.charAt(0);     //message 문자열에서 첫번째(0) 글자 1개 가져옵니다.

				//Exception 예시2 :ArrayIndexOutOfBoundsException
				int[] nums = new int[5];		//배열선언 : 요소 5개입니다.
				nums[5] =100;

				//Exception 예시3:InputMismatchException 정수 외의 다른 문자 입력하면 Exception발생
				Scanner sc = new Scanner(System.in);
				System.out.println("정수입력>>>");
				int a = sc.nextInt();			//키보드입력을 정수로 변환해서 변수에 저장합니다.
				System.out.println("당신이 입력한값"+a);
				
				
	}
}
/*
 *문법 오류: int a = 4.1;와 같이 컴파일 자체가 안됩니다. 
Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류 입니다.(발생가능성을 고려해서 프로그래밍해야합니다.)
     -> 원인에 따라 다른이름 XXXXException 이 발생하고 이들은 Exception 클래스의 자식 클래스입니다.
     -> Exception 이 실행 중에 발생하면 그 이후는?..... 프로그램이 그 시점부터 중단됩니다. 
         따라서, Exception 을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
*/