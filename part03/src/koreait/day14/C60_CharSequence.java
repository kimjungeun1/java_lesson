package koreait.day14;

import java.util.*;


public class C60_CharSequence {
//CharSequence�������̽�  ����ü:String, StringBuffer, StringBuilde
	public static void main(String[] args) {
		
		String result = new String();//result="test"; result = new String("test");
		System.out.println("�ʱ� result:"+result);
		System.out.println("1. String Ÿ�� �׽�Ʈ");
		for (int i = 2; i < 6; i++) {
			//���ڿ� ������ �ٲ�� ���ڿ� ��ü ��ġ�� �޶����ϴ�.
			result+= i+"/";	//result = result +(i+"/");
			System.out.println("result:"+result);
			
		}
		StringBuffer sb = new StringBuffer();	//StringBulider�� �Բ� ���� ���Ǵ�Ŭ����
		System.out.println("2. StringBuffer Ÿ�� �׽�Ʈ");
		//StringBuffer��ü�� ���ڿ� ������ �ٲ� ���� ��ü�� �߰��Ǵ� ������ �մϴ�.
		//�ݺ��Ǵ� ���� ������ ���� String?x StringBuffer?O ȿ�����Դϴ�.
		for (int i = 2; i < 6; i++) {
			sb.append(i).append(":");	//���ڿ� ���� ����+�� ���� ����
			System.out.println("sb:"+sb);
		}
		
		//CharSequence�������̽� ���: contains �޼ҵ��� �Ű����� Ÿ��
		//boolean java.lang.String.contains(CharSequence s)
		
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3. contains�޼ҵ� Ȯ��");
		System.out.println("contains(result):"+sample.contains(result));//true
		System.out.println("contains(sb):"+sample.contains(sb));//false
		
		//�޼ҵ��� ���� �Ǵ� �ٸ� ���� ���ĵ��� Ȯ���� �� 1)Ŭ���� or �������̽� 2)�������̽��ϋ� ����ü�� �����ΰ�?
		
		//����: ArrayList �����ҋ� ���� ���� List�������̽� Ÿ������ �ϱ�
		//		HashMap		"		Map		 "
		List<String>names = new ArrayList<>();
		names = new Vector<>();
		
		Map<String,Integer>map = new HashMap<String,Integer>();	//��ü ������ ���ʸ� Ÿ�� ���� ����.
		map = new TreeMap<String,Integer>();
		
	}
}
