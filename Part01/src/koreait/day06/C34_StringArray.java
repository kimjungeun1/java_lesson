package koreait.day06;

import java.util.Arrays;
import java.util.Scanner;

public class C34_StringArray {
	public static void main(String[] args) {
		String message = "hi java";//message�� ��������
		
		String[]engkey = {"continue","break","public","static","dynamic"};
		
		//int, double, char �迭������ ��Ҹ� ��Ÿ���� nums[2], carr1[2], point[2
		//											�� �⺻�� ������Ÿ��
		//engkey�Ӹ� �ƴ϶� engkey[2]�� String������Ÿ��
		
		for (int i = 0; i < engkey.length; i++) {
			System.out.println(engkey[i]);// engkey[i]�� String ������
		}
		String[] koreans = new String[5];	//�迭����� ���� ������������ ����X, ������ ����
											// �⺻ �ʱⰪ��> null(�ƹ��͵� �������� ���� ����)
		
		for (int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]);
		}
		System.out.println("1.engkey �迭��Ұ��� �����ϴ� ���ڿ��� ����");
		for (int i = 0; i < engkey.length; i++) {
			System.out.println(engkey[i]+":"+engkey[i].length());
			
			koreans[0]="����ϴ�";
			koreans[1]="���ߴ�";
			koreans[2]="������";
			
			System.out.println("2.koreans �迭��Ұ��� �����ϴ� �L�ڿ��� ����");
			for (int j = 0; j < koreans.length; j++) {
				if(koreans[i]!=null)
					System.out.println(koreans[i]+":"+koreans[i].length());
			//�����ϰ��ִ� ��ü�� ������ �޼ҵ�/�ʵ� �����ϸ� ����: korea[3],korea[4]�� null ����
				
//				String temp=null;
//				System.out.println(temp.length()); //����
				
				Scanner sc = new Scanner(System.in);
				System.out.println("static��?>>>");
				koreans[3]=sc.nextLine();
				System.out.println("static��?>>>");
				koreans[4]=sc.nextLine();
				System.out.println("3. ��� �Էµ� koreans�迭 Ȯ��");
				for (int i1 = 0; i1 < koreans.length; i1++) {
					System.out.println(koreans[i1]);
				}
						
				//����ڰ� �Է��� ����ܾ engkey�迭 �ε��� �������?
				System.out.println("ã�� �ܾ��?");
				String find = sc.nextLine();
				int index=-1;
				
				for (int k = 0; k < engkey.length; k++) {
					index = -1;
					if(find.equals(engkey[i]))
						index=i;
					break;
				}
						System.out.println("ã�� �ܾ� ��ġ: "+ index);
						if(index==-1)
							System.out.println("ã�� �ܾ engkey�� �����ϴ�.");
			}
				
				
				
				
				
				
				
				
				
		}
		
		}
	
}
