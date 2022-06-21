package koreait.day06;

import java.util.Random;

public class C31_RandomEx {
	public static void main(String[] args) {
		/*
		 * �л�����(����) ���� ������ ����ϴ�.
		 * �л� �ο��� 100��-������ ���������� �׽�Ʈ(0<=����<=100)
		 * 
		 * 90~100 : 0��(0.0%) ī��Ʈ ������ 5�� �ʿ��մϴ�.(cntA, cntB, cntC, cntD, cntE)
		 * 80~89 : 0��(0.0%)						�� counts[5]:counts[0], counts[1]		
		 * 70~79 : 0��(0.0%)
		 * 60~69 : 0��(0.0%)
		 * 60�� �̸� : 0��(0.0%)
		 * 
		*/
		int[]koreans = new int[100];
		int[]counts = new int[5];
		Random r = new Random();
		System.out.println("[[[�л����� ���� ����]]]");
		
		for (int i = 0; i < koreans.length; i++) {
			koreans[i]=r.nextInt(101);
		}//�������� ����
		
		for (int i = 0; i < koreans.length; i++) {
			if(koreans[i]>=90) {
				counts[0]++;
			}else if(koreans[i]>=80) {
				counts[1]++;
			}else if(koreans[i]>=70) { 
				counts[2]++;
			}else if(koreans[i]>=60) { 
				counts[3]++;
			}else if(koreans[i]<60) {
				counts[4]++;
			}
			
			
		}
		
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60�̸�");
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%8d ",counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%8.1f%%",(double)counts[i]*koreans.length/100);
		}
		
		//�迭���� ����� ���(������ ����,�߰�)�Ȱ��� �ڹ�ArrayList
		//�迭������ ���� �����͸� �߰�/������ �����մϴ�. -> �޼ҵ� ����
		
		
		
	}
}
