package koreait.day09;

import java.util.*;

public class MathProblem {
	//인스턴스 필드: static이 아닌 형식. 객체가 생성될 때마다 다른값을 갖는다.
	private int n1;
	private int n2;
	private char op;  //+,-,/,*
	private boolean isCorrect;//사용자 입력한 답이 정답인지 여부
	//static(정적) 필드
	public static final int max_size = 20;	//문제 최대갯수는 20
	
	public MathProblem(char op) {
		this.op = op;   //인자로 전달받은 값이 연산자.
	}
	/*참고
	 * static 메소드는 인스턴스 필드값과 무관하게 동작하는 메소드
	 * 인스턴스 메소드는 인스턴스 필드값과 상관있는 동작하는 메소드
	*/
	
	public void makeProb() { // 사칙연산 종류별로 적절한 난수 생성하기->문제를 만들어 줍니다.

		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;	
		switch (op) {
		case '+':
			max1=99;max2=99;min1=11;min2=11;	//n1,n2 모두 11~99	
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11;	//n1은 50~99, n2는 11~49
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11;	//n1은 11~77 n2는 11~29	
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11;	//n1은 41~99, n2는 11~29
			break;

		}
		n1=r.nextInt(max1-min1+1)+min1; //난수범위 min1-max1
		n2=r.nextInt(max2-min2+1)+min2;	//난수범위min2-max2
	}

	public int showAnswer() {		//n1,n2,op 필드값을 가져와서 정답계산하여 반환합니다.
		int result=0;
	
		switch (op) {
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		}
		
		return result;
	}
	
	
	
	public String problem() {
		return n1 + " " + op + " " + n2 + " = ";
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	

}
