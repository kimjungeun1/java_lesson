package koreait.day08;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.*;

public class NumberGame {
public static void main(String[] args) {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int[] triallst = new int [10];
	String trialstr;
	
	System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
	System.out.println("��, �޸��� ���纸����.(101~299)");
	int numComputer = r.nextInt(199)+101;
	int numHuman;
	int i = 0;
	do { 
		System.out.println("������ ���� �Է�(��ȸ: " +(10-i)+") - >");
		numHuman=sc.nextInt();
		if(numComputer>numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
		}else if(numComputer<numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("�ƴմϴ�. �� ���� �� �Դϴ�.");
			
		
		}
		if(i==10) break;
	}while (numComputer!=numHuman);
	if(i==10) {
		System.out.println("�� �޸� �Է³���: "+Arrays.toString(triallst));
		System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�.������ �ٽ� �����ϼ���");
	}else {
		System.out.println("������ ���߼̽��ϴ�. �������� �õ��� Ƚ��"+(i+1)+"��");
	}


}
}
