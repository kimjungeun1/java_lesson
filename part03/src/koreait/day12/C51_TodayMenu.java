package koreait.day12;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class C51_TodayMenu {

	public static void main(String[] args) {
		
		System.out.println("������ ����޴� ��ǥ�մϴ�.!!");
		String foods="ġ��, ������,��â,�Ұ��, �ܹ���, ��¡�� ��ȸ";
		
		//Key:�޴� �̸� value: ��ǥ��
		
		//�ʱ�ȭ
		HashMap<String, Integer>map = new HashMap<>();
		map.put("ġ��", 0);
		map.put("������",0);
		map.put("��â", 0);
		map.put("�Ұ��", 0);
		map.put("�ܹ���", 0);
		map.put("��¡�� ��ȸ", 0);
		
		Scanner sc = new Scanner(System.in);
		//�޴�����
		while(true) {
			System.out.println(foods);
			System.out.println("���ø޴� ���ĸ� �Է��ϼ���(����� end �Է�->");
			String menu = sc.nextLine();
			if(menu.equals("end"))break;
			
			if(!map.containsKey(menu)) {
			System.out.println("���� �޴��Դϴ�. �ٸ����� ��ǥ�� �ּ���.");
			map.put(menu, 1); foods+=","+menu;
			continue;}
			//�Է¹��� menu�� value���� ��������-> +1�ϱ�-> ����� �����ϱ�
			int temp = map.get(menu);
//			++temp;
//			map.put(menu, temp);
			map.put(menu, ++temp);
			System.out.println(map);
					
		}
		System.out.println("��ǥ �����մϴ�.");
		System.out.println(map);
		System.out.println("�ִ� ��ǥ��:"+Collections.max(map.values()));
		System.out.println("����:"+Collections.max(map.keySet()));
		
		
		
		
		
		
		
		
	}
}
