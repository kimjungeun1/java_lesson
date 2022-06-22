package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {
public static void main(String[] args) {
	int n10 = 123;
	int n16 = 0xa41c;				//16진수 표기는 0x로 시작합니다.
	int n2 = 0b1010010000011100;//2진수 표기 0b로 시작합니다.
	
	System.out.println("1.변수를 그대로 출력");
	System.out.println("10진수 리터럴 123:"+n10);
	System.out.println("16진수 리터럴 0xa41c :"+n16);		//정수값 출력은 format지정 안하면 10진수
	System.out.println("2진수 리터럴 0b1010010000011100:"+n2);
	
	System.out.println("2. format 지정하여 16진수 출력");
	System.out.println(String.format("16진수 리터럴 0xa41c:%x",n16));
	System.out.println(String.format("2진수 리터럴 0b1010010000011100:%x",n16));
	System.out.println(String.format("10진수 리터럴 42012:%x",42012));
	//결론 : 10진수 42012, n16과 n2변수같이 메모리에 저장될떄는 모두 동일한 0,1 표현입니다.
	
	System.out.println("3. -1의 2진수, 16진수 표현 확인");
	n16=0xfffffff;
	System.out.println("16진수 0xffffffff:"+n16);//-1
	System.out.printf("-1은 16진수 %x\n",-1);
	System.out.println("-1은 2진수:"+Integer.toBinaryString(-1));
	
	System.out.println("4.입력한 2진수 또는 16진수 값을 10진수로 바꾸어 드입니다.");
	Scanner sc = new Scanner(System.in);
	System.out.print("2진수값 입력>>>>");
	String t2 = sc.nextLine();
	System.out.print("16진수값 입력>>>>");
	String t16 = sc.nextLine();
	//원래는 Integer.parseInt(s)형식이였고 s문자열이 10진수 표현하는 의미입니다.
	
	System.out.println(String.format("2진수 %s는 10진수 %d입니다.",
			t2,Integer.parseInt(t2,2))); //t2는 2진수이다. -> 메서드 결과 정수값
	System.out.println(String.format("16진수 %s는 16진수 %d입니다.", 
			t16,Integer.parseInt(t16,16)));//t16은 16진수 이다. -> 메소드 결과 정수값
							//음수는 -기호 써서 절대값 넘지 않는 범위에서 문자열 입력
							//최대음수 입력값은 -7fffffff
	
	
	
							/*n은 2(Binary), 8(Octal), 16(Hex) 가능합니다.
							 * n진법 문자열-> 10진 정수값 반환 Integer.parseINt(문자열,n)
							 * 10진 정수값 -> n진법 문자열 Integer.ToBinaryString 메소드 ,toHexString 메소드
							 * 
							 * format에서 %d는 10진수, %x는 16진수, %o는 8진수, 참고로 2진수는 포멧형식 없습니다.
							 * 
							 * 2진수의 비트연산: &,|,^,~,>>,<< 등등 간단히 테스트
							 * 
							*/
}
}
