package koreait.day09;

import java.util.*;


public class C43_RedPenExam2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int size=5;
		int max_size = MathProblem.max_size;
		
		MathProblem[] problems = new MathProblem[size];
		//모든 문제 저장하는 배열

		//배열의 타입은 MathProblem 객체참조형:n1,n2,op,isCorrect
		
		
		int ans[]=new int[size];
		int cnt=0;
		System.out.println("-----------------------------");
		System.out.println("빨간펜 수학 2자리 덧샘문제 풀기");
		System.out.println("-----------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<size;i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			
			System.out.print("문제"+(i+1+". "+temp.problem()+"= 답입력->"));
				ans[i]=sc.nextInt();
				
			if(ans[i]==temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			problems[i]=temp;
		}
		System.out.println("--------------------------------");
		System.out.println("채점합니다. 맞은갯수"+ cnt+"("+(cnt*100/size)+")점");
		System.out.println(":::틀린문제 정답보기:::");
		
//		for(int i =0;i<problems.length;i++)
//			if(!problems[i].isCorrect())
//			System.out.println("문제"+(i+1)+". "+problems[i].problem()+problems[i].showAnswer()+"//내가 입력한 값(오답) "+ans[i]);
//		
		for (MathProblem i : problems) {
			if(!i.isCorrect())
			System.out.println(i.problem()+i.showAnswer());
				
				
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}
}
