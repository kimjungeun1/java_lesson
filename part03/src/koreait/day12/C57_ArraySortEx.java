package koreait.day12;
//작성자 김정은
import java.util.Arrays;

public class C57_ArraySortEx {
//배열에 저장된 값을 직접 정렬 구현해보기
	public static void main(String[] args) {
	 String names[]= {"제니","다현","나연","신비","은하","모모"};
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
