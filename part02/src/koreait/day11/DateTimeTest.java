package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
public static void main(String[] args) {
	//����ð�: ms,ns(1970�� 1��1�� ������ �������� �������� ī��Ʈ�� ��)
	
	//1��,1���� ���� ��ms�ϱ��? 1�� = 1000ms(1ms=0.001��)
	//1�� = 24�ð� *60��*60��*1000=>result������ ����
	int result = 24*60*30*1000;
	System.out.println("1����"+result+"ms�Դϴ�.");
	System.out.println("1����"+result*365l+"ms�Դϴ�.");
	
	DecimalFormat df = new DecimalFormat("###,###,###,###");
	System.out.println("1����"+df.format(result)+"ms�Դϴ�.");
	System.out.println("1����"+df.format(result*365l)+"ms�Դϴ�.");

	/*��¥�� �ð������� �ٷ�� �ڹ�Ŭ������ �����մϴ�.
	1)java.util.Date Ŭ����			-> old����
 	2)java.util.Calendar Ŭ����		-> old����
	3) java 8 ����  java.time.LocalDate(��¥) , LocalTime(�ð�) , LocalDateTime(��¥�� �ð�) Ŭ����
*/
	
	LocalDate currentDate = LocalDate.now();	//static �޼ҵ�� ��ü�� ����
	System.out.println("��¥Ȯ��: "+currentDate);
	
	LocalTime currentTime = LocalTime.now();
	System.out.println("�ð� Ȯ��:"+currentTime);
	
	LocalDateTime current = LocalDateTime.now();
	System.out.println("������ �ð� Ȯ��:"+current);
	
	LocalDate mybirth = LocalDate.of(2000, 8, 23);
	System.out.println("�� ź���� Ȯ��:"+mybirth);
	
	LocalTime mybirthtime = LocalTime.of(18, 10);
	System.out.println("�� ź���ð�:"+ mybirthtime);
	
	//������ Ŭ������ ��¥ ������ ���� ��� Ŭ������ �ֽ��ϴ�.(���� �¾�� ���? ���? ����?)
	Period between = Period.between(mybirth, currentDate);
	System.out.println("���� �¾��"+between.getYears() +"��(year)");
	System.out.println("���� �¾��"+between.getMonths() +"����(month)");
	System.out.println("���� �¾��"+between.getDays() +"��(days)");
	
	System.out.println("�׽�Ʈ:"+ChronoUnit.DAYS.between(mybirth, currentDate));
	//Duration Ŭ����
	//ChronoUnit Ŭ����
	
	
	
	
	
	
	
	
}
}
