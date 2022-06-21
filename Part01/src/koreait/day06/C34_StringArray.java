package koreait.day06;

import java.util.Arrays;
import java.util.Scanner;

public class C34_StringArray {
	public static void main(String[] args) {
		String message = "hi java";//message는 참조변수
		
		String[]engkey = {"continue","break","public","static","dynamic"};
		
		//int, double, char 배열에서는 요소를 나타내는 nums[2], carr1[2], point[2
		//											ㄴ 기본형 데이터타입
		//engkey뿐만 아니라 engkey[2]도 String참조형타입
		
		for (int i = 0; i < engkey.length; i++) {
			System.out.println(engkey[i]);// engkey[i]는 String 참조형
		}
		String[] koreans = new String[5];	//배열요소의 값이 가본형데이터 저장X, 참조값 저장
											// 기본 초기값은> null(아무것도 참조하지 않은 상태)
		
		for (int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]);
		}
		System.out.println("1.engkey 배열요소값이 참조하는 문자열의 길이");
		for (int i = 0; i < engkey.length; i++) {
			System.out.println(engkey[i]+":"+engkey[i].length());
			
			koreans[0]="계속하다";
			koreans[1]="멈추다";
			koreans[2]="공용의";
			
			System.out.println("2.koreans 배열요소값이 참조하는 묹자열의 길이");
			for (int j = 0; j < koreans.length; j++) {
				if(koreans[i]!=null)
					System.out.println(koreans[i]+":"+koreans[i].length());
			//참조하고있는 객체가 없을때 메소드/필드 참조하면 오류: korea[3],korea[4]은 null 참조
				
//				String temp=null;
//				System.out.println(temp.length()); //오류
				
				Scanner sc = new Scanner(System.in);
				System.out.println("static뜻?>>>");
				koreans[3]=sc.nextLine();
				System.out.println("static뜻?>>>");
				koreans[4]=sc.nextLine();
				System.out.println("3. 모두 입력된 koreans배열 확인");
				for (int i1 = 0; i1 < koreans.length; i1++) {
					System.out.println(koreans[i1]);
				}
						
				//사용자가 입력한 영어단어가 engkey배열 인덱스 몇번인지?
				System.out.println("찾을 단어는?");
				String find = sc.nextLine();
				int index=-1;
				
				for (int k = 0; k < engkey.length; k++) {
					index = -1;
					if(find.equals(engkey[i]))
						index=i;
					break;
				}
						System.out.println("찾은 단어 위치: "+ index);
						if(index==-1)
							System.out.println("찾는 단어가 engkey에 없습니다.");
			}
				
				
				
				
				
				
				
				
				
		}
		
		}
	
}
