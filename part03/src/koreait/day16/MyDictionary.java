package koreait.day16;


import java.util.*;

//작성자 김정은
public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		int num;
		int level;
		String english;
		String mean = null;
		boolean power = true;
		while(power) {
			System.out.println("💙💙💙💙단어장💙💙💙💙");
			System.out.println("선택기능 👉 1. 단어저장 2.단어검색 3. 전체보기 4. 레벨로 검색 5. 프로그램 끝내기");
			System.out.print("선택✏->");
			num= sc.nextInt();
		switch(num) {
		case 1: System.out.print("English ->\n");
				english = sc.next();
				System.out.println("Korean->");
		   		mean = sc.next();
		   		System.out.println("레벨->");
		   		level=sc.nextInt();
		   		Word temp = new Word(english, mean);
		   		mywords.add(temp);
		   		break;
		   		
		case 2: System.out.print("검색단어 English ->");
					english=sc.next();
				for (Word w : mywords) {
					if(w.getEnglish().equals(english))
						System.out.println("단어장 검색했습니다. 결과=>"+w);
				}
				break;
		
		case 3: 
//			System.out.println("단어장 전체보기:"+mywords);
			all(mywords);
			break;
		case 4: 
			System.out.println("검색할 레벨 입력(1~3)->");
			int no = sc.nextInt();
			level(mywords,no);
		case 5: power=!power;
				break;
		default:
			System.out.println("질못선택한 번호 입니다.");
			break;
		}	//switch
		}	//while
		System.out.println("단어장 종료");
	}//main

	private static void level(List<Word> mywords, int no) {
		for (Word w : mywords) {
			if (w.getLevel()==(no)) {
				System.out.println(w);
				
			}
		}
		
	}

	private static void all(List<Word> mywords) {//mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
				
			}
		});
		
		System.out.println(String.format("%-20s %-20s %10s", "English","Korean","Level"));
		System.out.println("=============================================");
		for (Word w : mywords) {
			System.out.println(String.format("%-20s %-20s %10d", w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
		
	}
	}//class
