package koreait.day12;
//�ۼ��� ������
import java.util.Arrays;

public class C57_ArraySortEx {
//�迭�� ����� ���� ���� ���� �����غ���
	public static void main(String[] args) {
	 String names[]= {"����","����","����","�ź�","����","���"};
		String temp;
		for (int i = 0; i < names.length-1; i++) {
			for (int k=i+1; k < names.length; k++) {
				if(names[i].compareTo(names[k])>0) {
					temp=names[i];
					names[i]=names[k];
					names[k]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
		
	}
}
