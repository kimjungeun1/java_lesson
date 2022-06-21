package koreait.day16;

//조사하게요: enum(열거형타입)-> 상수만 정의한 클래스
public class Word {
	public static final int BASIC = 1;	//기초
	public static final int PRACTICAL= 2;//활용
	public static final int EXPERT= 3;	//전문가
	
	
	
	private String eng;
	private String Kor;
	private int level;
	
	
	@Override
	public String toString() {
		//삼항연산자
		return eng + " " + Kor + " " + level+
				(this.level== BASIC?"(기초)":this.level== PRACTICAL?"(활용)":"(전문가)")+"";
	}
	public Word () {
		
	}
	public Word(String english) {
		this.eng = english;
	}
	public Word(String english, String Korean) {
		this.eng = english;
		this.Kor=Korean;
		this.level=level;
	}
	public Word(String english, String Korean,int level) {
		this.eng = english;
		this.Kor=Korean;
		this.level=level;
	}
	public String getEnglish() {
		return eng;
	}
	public String getKorean() {
		return Kor;
	}
	public int getLevel() {
		return level;
	}
	public void setEnglish(String english) {
		this.eng = english;
	}
	public void setKorean(String korean) {
		Kor = korean;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
