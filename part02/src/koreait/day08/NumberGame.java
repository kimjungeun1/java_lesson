package koreait.day08;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.*;

public class NumberGame {
public static void main(String[] args) {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int[] triallst = new int [10];
	String trialstr;
	
	System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
	System.out.println("너, 휴면은 맞춰보세요.(101~299)");
	int numComputer = r.nextInt(199)+101;
	int numHuman;
	int i = 0;
	do { 
		System.out.println("생각한 숫자 입력(기회: " +(10-i)+") - >");
		numHuman=sc.nextInt();
		if(numComputer>numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("아닙니다. 더 큰 값입니다.");
		}else if(numComputer<numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("아닙니다. 더 작은 수 입니다.");
			
		
		}
		if(i==10) break;
	}while (numComputer!=numHuman);
	if(i==10) {
		System.out.println("너 휴먼 입력내용: "+Arrays.toString(triallst));
		System.out.println("주어진 기회를 다 쓰셨습니다.게임을 다시 시작하세요");
	}else {
		System.out.println("딩동댕 맞추셨습니다. 성공까지 시도한 횟수"+(i+1)+"번");
	}


}
}
