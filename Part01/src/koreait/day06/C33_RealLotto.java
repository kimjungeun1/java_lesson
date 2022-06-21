package koreait.day06;

import java.util.*;

public class C33_RealLotto {
//�ۼ��� ������
	public static void main(String[] args) {
		int[] numbers = new int[45];
		Random r = new Random();
		
		//for���� ���� �ζǹ�ȣ�� �迭�� ���������� �Է�
		for (int i = 0; i < 45; i++) {
			numbers[i]=i+1;
		}
		
	System.out.println("numbers �迭 �ʱⰪ--------------------");
	System.out.println(Arrays.toString(numbers));//numbers�迭 ���
	System.out.println("-------------------------------------");

	int[]lotto = new int[6];//��÷��ȣ �迭����
	int k;
	for (int cnt = 0; cnt < 6; cnt++) {
		k=r.nextInt(45-cnt); //�ݺ�Ƚ����ŭ �þ 45�� ����
		System.out.println("k="+k+",number = "+numbers[k]);//�������� ���� �ε������� �� ��ġ���ִ� �� ���
		
		lotto[cnt]=numbers[k];//�ζ� ��÷��ȣ �迭�� �������� ���� �� ����
		
		for (int i = k; i < numbers.length-1; i++) {//�������� ���� �ε���(k)��ġ���ִ� ���� ����� �������� �̵�
			numbers[i]=numbers[i+1];
			
		}
		System.out.println(Arrays.toString(numbers));//k�������� ������� �� �����ʿ� 45�� �þ���� �� �� ����
	}
		System.out.println("���� ���� ����:");
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto);//lotto�迭���� ũ�� ������� ��ġ�� �����մϴ�.
		System.out.println(Arrays.toString(lotto));
	
	}
}
