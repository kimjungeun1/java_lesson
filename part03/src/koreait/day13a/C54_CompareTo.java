package koreait.day13a;

public interface C54_CompareTo {
public static void main(String[] args) {
//��� ��ü���� (Object���)comopareTo �޼ҵ尡 �ֽ��ϴ�.	
	
	String na = "kim";
	String you = "momo";
	String he = "Son";
	
	//String �� ���ĺ�(������)�� : �빮�ڰ� �ҹ��ں��� �۴� �빮��<�ҹ���
	System.out.println("Kim�� momo:"+na.compareTo(you));//-2(����)
	System.out.println("kim�� son:"+na.compareTo(he));//24(���)
	
	int a = 12,b=45;
	System.out.println("a-b:"+(a-b));	//12-45<0

	Integer aa = 12;
	Integer bb =45;
	System.out.println("12�� 45:"+aa.compareTo(bb));
	aa=90;
	System.out.println("90�� 45:"+aa.compareTo(bb));
	aa=45;
	System.out.println("45�� 45:"+aa.compareTo(bb));
	
	//compareTo�� ���� �񱳴� sort(����)�� ���ȴ�.
	// ������ ��������, �������� 2���� ������� �� �� �ֽ��ϴ�.
	
}
}




