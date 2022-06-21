package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;
//읽어올 수 있는 텍스트 파일은 인코딩이 일치해야 합니다.
//workspace UTF-8이면 텍스트파일 UTF_*형식만
//			MS949이면 텍스트파일 ANSI형식만
public class C67_ResourceClose2 {
	public static void main(String[] args) {
		//파일복사
//		String filename = "C:\\Users\\김정현\\Desktop\\part3\\자바테스트.txt";//읽기: 존재하는 파일	
//		String filename2 = "C:\\Users\\김정현\\Desktop\\part3\\자바테스트2.txt";	//쓰기: 존재하지 않는 파일
		
		//파일 대화상자 사용하기
		String filename = fileDialogOpen();// 복사한 파일은 지정하세요
		String filename2 = fileDialogSave();//저장한 파일은 폴더로 찾아가서 파일명을 직접 쓰세요
		
		File ifile = new File(filename);//지정된 경오릐 파일명으로 파일객체 생성
		File ofile = new File(filename2);
		
		//Scanner : 입력 기능을 갖는 클래스
		//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try~catch 필요하다.
		
		try {Scanner sc=new Scanner(ifile); PrintWriter pw = new PrintWriter(ofile);
			while(sc.hasNext()) {//구분자 엔터를 기준으로 다음 데이터가 있으면 true
				String temp = sc.nextLine();//파일에서 읽어온 1중
				System.out.println(temp);//표준출력 (콘솔)
				pw.println(temp);//파일출력
				
			}
			System.out.println("파일 복사 완료");	//System.out :표준 출력(콘솔 출력)
			sc.close();
			pw.close();
		} catch (Exception e) {//FileNotFoundException 이외의 모든 Exception 처리
			//출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다.
			System.out.println("사용자 오류발생 : "+e.getMessage());
			System.out.println("지정된 파일이 없습니다.");
		}
		
		
//with-resource: 카워드가 아니고 리소스를 다루는(처리하는)try문
	}
		public static String fileDialogOpen() {
//콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
//자바에서도 GUI 를 만들수 있는 클래스들이 있습니다. 그 중 하나인 파일대화상자를 사용합니다. 라이브러리는 awt,swing,javaFX 등이 있습니다.
//Windows OS는 응용프로그램들이 window라는 틀 안에서 만들어지는데 자바에서는 그것은 프레임이라고 합니다.
		
		JFrame f = new JFrame();  //파일대화상자를 시작할 프레임객체 생성
		
		FileDialog fdr = new FileDialog(f,"파일 열기",FileDialog.LOAD);	//파일대화상자 객체 생성
		fdr.setVisible(true);		//파일 대화상자 보이기
		
		String filename = fdr.getDirectory() + fdr.getFile(); 	//선택한 파일의 경로와 파일명 연결
		System.out.println("선택한 경로와 파일 : " + filename);
		File file = new File(filename);
		System.out.println("선택한 파일 크기:"+file.length()+"바이트");
		
		
		return filename;
	}
public static String fileDialogSave() {
	JFrame f = new JFrame();  //파일대화상자를 시작할 프레임객체 생성
	FileDialog fdw = new FileDialog(f,"파일 저장",FileDialog.SAVE);
	fdw.setVisible(true);
	String filename = fdw.getDirectory() + fdw.getFile(); 
	System.out.println("저장한 경로와 파일 : " + fdw.getDirectory() + fdw.getFile());
	return filename;
	
	
	
}
}