package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		//배열요소의 삽입 삭제
		int[]test = {11,22,33,44,55,66,77};
		
		for (int i = 2; i >=test.length-1; i++) {
			test[i+1]=test[i];
		}
		test[2]=23;
		for (int j = 0; j < test.length; j++) {
			System.out.print(test[j]+"\t");
		}
	
		int[] test2 = {11,22,33,44,55,66,77};
			//인덱스 2를 삭제할 떄 - 왼쪽인덱스 감소방향으로 이동
		for (int j =3; j < test.length; j++) {
			test2[j-1]=test2[j];
		}
		System.out.println(Arrays.toString(test2));
		
	Random r = new Random();
	int[]rotto = new int[45];
	int[]winnum = new int[7];
	for (int i = 0; i < rotto.length; i++) {
		rotto[i]=i+1;
		
	}
	for (int i = 0; i < winnum.length; i++) {
		winnum[i]=rotto[r.nextInt(46)];
		
	}
	
	
	}
}
