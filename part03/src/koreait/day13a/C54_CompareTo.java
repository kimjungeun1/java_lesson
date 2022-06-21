package koreait.day13a;

public interface C54_CompareTo {
public static void main(String[] args) {
//모든 객체에는 (Object상속)comopareTo 메소드가 있습니다.	
	
	String na = "kim";
	String you = "momo";
	String he = "Son";
	
	//String 은 알파벳(사전식)비교 : 대문자가 소문자보다 작다 대문자<소문자
	System.out.println("Kim과 momo:"+na.compareTo(you));//-2(음수)
	System.out.println("kim과 son:"+na.compareTo(he));//24(양수)
	
	int a = 12,b=45;
	System.out.println("a-b:"+(a-b));	//12-45<0

	Integer aa = 12;
	Integer bb =45;
	System.out.println("12와 45:"+aa.compareTo(bb));
	aa=90;
	System.out.println("90와 45:"+aa.compareTo(bb));
	aa=45;
	System.out.println("45와 45:"+aa.compareTo(bb));
	
	//compareTo와 같은 비교는 sort(정렬)에 사용된다.
	// 정렬은 오름차순, 내림차순 2가지 방법으로 할 수 있습니다.
	
}
}




