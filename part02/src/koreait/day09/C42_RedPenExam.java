package koreait.day09;

import java.util.*;

public class C42_RedPenExam {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int size=5;
		int[]x1=new int[size];
		int[]x2=new int[size];
		int[]answer=new int[size];
		int cnt=0;
		System.out.println("-----------------------------");
		System.out.println("������ ���� 2�ڸ� �������� Ǯ��");
		System.out.println("-----------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0;i<x1.length;i++) {
			x1[i]=r.nextInt(89)+11;
			x2[i]=r.nextInt(89)+11;
			System.out.print(String.format("����%2. %d + %d = ���Է�->",
												i+1,x1[i],x2[i]));
			answer[i]=sc.nextInt();
			if(answer[i]==x1[i]+x2[i]) {
				cnt++;
			}
		}
		System.out.println("--------------------------------");
		
	}
}
