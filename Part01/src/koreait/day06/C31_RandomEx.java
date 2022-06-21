package koreait.day06;

import java.util.Random;

public class C31_RandomEx {
	public static void main(String[] args) {
		/*
		 * 학생성적(국어) 분포 보고서를 만듭니다.
		 * 학생 인원은 100명-점수는 랜덤값으로 테스트(0<=난수<=100)
		 * 
		 * 90~100 : 0명(0.0%) 카운트 변수가 5개 필요합니다.(cntA, cntB, cntC, cntD, cntE)
		 * 80~89 : 0명(0.0%)						ㄴ counts[5]:counts[0], counts[1]		
		 * 70~79 : 0명(0.0%)
		 * 60~69 : 0명(0.0%)
		 * 60점 미만 : 0명(0.0%)
		 * 
		*/
		int[]koreans = new int[100];
		int[]counts = new int[5];
		Random r = new Random();
		System.out.println("[[[학생성적 분포 보고서]]]");
		
		for (int i = 0; i < koreans.length; i++) {
			koreans[i]=r.nextInt(101);
		}//국어점수 저장
		
		for (int i = 0; i < koreans.length; i++) {
			if(koreans[i]>=90) {
				counts[0]++;
			}else if(koreans[i]>=80) {
				counts[1]++;
			}else if(koreans[i]>=70) { 
				counts[2]++;
			}else if(koreans[i]>=60) { 
				counts[3]++;
			}else if(koreans[i]<60) {
				counts[4]++;
			}
			
			
		}
		
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60미만");
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%8d ",counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%8.1f%%",(double)counts[i]*koreans.length/100);
		}
		
		//배열에서 기능이 향상(데이터 삭제,추가)된것이 자바ArrayList
		//배열에서는 직접 데이터를 추가/삭제를 구현합니다. -> 메소드 정의
		
		
		
	}
}
