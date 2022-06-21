package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

//Member ��ü�� sort: �񱳰����� ������ �ʵ��� �ϳ��� �����ؼ� ���� Comparator ����ü ����ϴ�.
public class MemberAgeAscending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age2.compareTo(age1);//����
	}
	
	
}