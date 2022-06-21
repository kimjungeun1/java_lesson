package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

//Member 객체의 sort: 비교가능한 값으로 필드중 하나를 선택해서 비교자 Comparator 구현체 만듭니다.
public class MemberAgeDescending2 implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age2.compareTo(age1);//내림차순
	}
	
	
}
