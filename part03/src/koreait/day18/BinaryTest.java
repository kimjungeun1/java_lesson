package koreait.day18;

public class BinaryTest {

	public static void main(String[] args) {

		System.out.println(String.format("%8s\t %8s\t %8s","10진수","2진수","16진수"));
		for (int i = 0; i < 100; i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i,Integer.toBinaryString(i),Integer.toHexString(i)));
		}
		// 10진수 정수값을 다른 진법(진수)으로 문지열 변환
//		Integer.toBinaryString(0);-2진수
//		Integer.toOctalString(0);-8진수
//		Integer.toHexString(0);-16진수
	}
}
