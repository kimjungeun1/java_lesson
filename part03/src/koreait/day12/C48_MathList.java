package koreait.day12;

import java.util.*;


//작성자 김정은
//43번 예제리스트로 변경하기
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int size=5;
		ArrayList<MathProblem>list =new ArrayList<>();

		
		
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
			list.add(temp);
		}
		System.out.println("--------------------------------");
		System.out.println("채점합니다. 맞은갯수"+ cnt+"("+(cnt*100/size)+")점");
		System.out.println(":::틀린문제 정답보기:::");
		
		for(int i =0;i<size;i++)
			if(!list.get(i).isCorrect())
			System.out.println("문제"+(i+1)+". "+list.get(i).problem()+list.get(i).showAnswer()+"//내가 입력한 값(오답) "+ans[i]);

		
		
		
		sc.close();
		
		
	}
}
