package koreait.day12;

import java.util.*;
//작성자 김정은
public class C52_MyDictionary {

	public static void main(String[] args) {
		TreeMap<String, String> vocabulary = new TreeMap<String, String>(); 
		Scanner sc = new Scanner(System.in);
		int num;
		String english;
		String mean = null;
		boolean power = true;
		while(power) {
			System.out.println("💙💙💙💙단어장💙💙💙💙");
			System.out.println("선택기능 👉 1. 단어저장 2.단어검색 3. 단어장보기 4. 프로그램 끝내기");
			System.out.print("선택✏->");
			num= sc.nextInt();
		switch(num) {
		case 1: System.out.print("English ->");
		   		english = sc.next();
		   		System.out.print("Korean ->");
		   		mean = sc.next();
		   		vocabulary.put(english, mean);
		   		break;
		   		
		case 2: System.out.print("검색단어 English ->");
				english = sc.next();
				System.out.print("단어장 검색했습니다.");
				System.out.println("결과 =>"+vocabulary.get(english));
				break;
		
		case 3: System.out.println("단어장 전체보기:"+vocabulary);
				break;
		case 4: power=!power;
					
		}	//switch
		}	//while
	}//main
	}//class
