package koreait.day08;

public class Member {
//�ۼ��� ������
	private String name;
	private String email;
	private int age;
	private int level;
	
	Member() {System.out.println(name+email+ age+level+"�� �⺻���Դϴ�");}
	
	
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
	}


	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
