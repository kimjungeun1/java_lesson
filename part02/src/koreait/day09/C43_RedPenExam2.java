package koreait.day09;

import java.util.*;


public class C43_RedPenExam2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int size=5;
		int max_size = MathProblem.max_size;
		
		MathProblem[] problems = new MathProblem[size];
		//��� ���� �����ϴ� �迭

		//�迭�� Ÿ���� MathProblem ��ü������:n1,n2,op,isCorrect
		
		
		int ans[]=new int[size];
		int cnt=0;
		System.out.println("-----------------------------");
		System.out.println("������ ���� 2�ڸ� �������� Ǯ��");
		System.out.println("-----------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0;i<size;i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			
			System.out.print("����"+(i+1+". "+temp.problem()+"= ���Է�->"));
				ans[i]=sc.nextInt();
				
			if(ans[i]==temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			problems[i]=temp;
		}
		System.out.println("--------------------------------");
		System.out.println("ä���մϴ�. ��������"+ cnt+"("+(cnt*100/size)+")��");
		System.out.println(":::Ʋ������ ���亸��:::");
		
//		for(int i =0;i<problems.length;i++)
//			if(!problems[i].isCorrect())
//			System.out.println("����"+(i+1)+". "+problems[i].problem()+problems[i].showAnswer()+"//���� �Է��� ��(����) "+ans[i]);
//		
		for (MathProblem i : problems) {
			if(!i.isCorrect())
			System.out.println(i.problem()+i.showAnswer());
				
				
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}
}
