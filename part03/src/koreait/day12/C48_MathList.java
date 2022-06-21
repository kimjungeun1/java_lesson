package koreait.day12;

import java.util.*;


//�ۼ��� ������
//43�� ��������Ʈ�� �����ϱ�
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int size=5;
		ArrayList<MathProblem>list =new ArrayList<>();

		
		
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
			list.add(temp);
		}
		System.out.println("--------------------------------");
		System.out.println("ä���մϴ�. ��������"+ cnt+"("+(cnt*100/size)+")��");
		System.out.println(":::Ʋ������ ���亸��:::");
		
		for(int i =0;i<size;i++)
			if(!list.get(i).isCorrect())
			System.out.println("����"+(i+1)+". "+list.get(i).problem()+list.get(i).showAnswer()+"//���� �Է��� ��(����) "+ans[i]);

		
		
		
		sc.close();
		
		
	}
}
