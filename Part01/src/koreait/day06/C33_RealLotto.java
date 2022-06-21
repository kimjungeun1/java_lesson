package koreait.day06;

import java.util.*;

public class C33_RealLotto {
//작성자 김정은
	public static void main(String[] args) {
		int[] numbers = new int[45];
		Random r = new Random();
		
		//for문을 통해 로또번호를 배열에 순차적으로 입력
		for (int i = 0; i < 45; i++) {
			numbers[i]=i+1;
		}
		
	System.out.println("numbers 배열 초기값--------------------");
	System.out.println(Arrays.toString(numbers));//numbers배열 출력
	System.out.println("-------------------------------------");

	int[]lotto = new int[6];//당첨번호 배열선언
	int k;
	for (int cnt = 0; cnt < 6; cnt++) {
		k=r.nextInt(45-cnt); //반복횟수만큼 늘어난 45를 빼줌
		System.out.println("k="+k+",number = "+numbers[k]);//랜덤으로 나온 인덱스값과 그 위치에있는 값 출력
		
		lotto[cnt]=numbers[k];//로또 당첨번호 배열에 랜덤으로 나온 수 저장
		
		for (int i = k; i < numbers.length-1; i++) {//랜텀으로 나온 인덱스(k)위치에있는 값을 지우고 왼쪽으로 이동
			numbers[i]=numbers[i+1];
			
		}
		System.out.println(Arrays.toString(numbers));//k번쨰값이 사라지고 맨 오른쪽에 45가 늘어난것을 알 수 있음
	}
		System.out.println("최종 선택 숫자:");
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto);//lotto배열값의 크기 순서대로 위치를 변경합니다.
		System.out.println(Arrays.toString(lotto));
	
	}
}
