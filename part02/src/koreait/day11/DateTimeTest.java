package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
public static void main(String[] args) {
	//현재시간: ms,ns(1970년 1월1일 자정을 기준으로 단위마다 카운트한 값)
	
	//1일,1년은 각각 몇ms일까요? 1초 = 1000ms(1ms=0.001초)
	//1일 = 24시간 *60분*60초*1000=>result변수에 저장
	int result = 24*60*30*1000;
	System.out.println("1일은"+result+"ms입니다.");
	System.out.println("1년은"+result*365l+"ms입니다.");
	
	DecimalFormat df = new DecimalFormat("###,###,###,###");
	System.out.println("1일은"+df.format(result)+"ms입니다.");
	System.out.println("1일은"+df.format(result*365l)+"ms입니다.");

	/*날짜와 시간형식을 다루는 자바클래스를 연습합니다.
	1)java.util.Date 클래스			-> old버전
 	2)java.util.Calendar 클래스		-> old버전
	3) java 8 버전  java.time.LocalDate(날짜) , LocalTime(시간) , LocalDateTime(날짜와 시간) 클래스
*/
	
	LocalDate currentDate = LocalDate.now();	//static 메소드로 객체를 생성
	System.out.println("날짜확인: "+currentDate);
	
	LocalTime currentTime = LocalTime.now();
	System.out.println("시간 확인:"+currentTime);
	
	LocalDateTime current = LocalDateTime.now();
	System.out.println("날씨와 시간 확인:"+current);
	
	LocalDate mybirth = LocalDate.of(2000, 8, 23);
	System.out.println("내 탄신일 확인:"+mybirth);
	
	LocalTime mybirthtime = LocalTime.of(18, 10);
	System.out.println("내 탄생시간:"+ mybirthtime);
	
	//새버전 클래스는 날짜 사이의 간격 계산 클래스가 있습니다.(내가 태어난지 몇년? 몇달? 몇일?)
	Period between = Period.between(mybirth, currentDate);
	System.out.println("내가 태어난지"+between.getYears() +"년(year)");
	System.out.println("내가 태어난지"+between.getMonths() +"개월(month)");
	System.out.println("내가 태어난지"+between.getDays() +"일(days)");
	
	System.out.println("테스트:"+ChronoUnit.DAYS.between(mybirth, currentDate));
	//Duration 클래스
	//ChronoUnit 클래스
	
	
	
	
	
	
	
	
}
}
