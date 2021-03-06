package koreait.day11.test;

public class Animal {
	static final String TYPE="동물";
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	public void act() {
		System.out.println("Animal 행동 : 아직 모름 (unknown)");
	}
	
	public void print() {
		System.out.println("name:" + name +",color:"+ color);
	}
	
	//Object 설명하고 작성한 메소드 입니다.
	public static boolean isDog(Object object) {
		return object instanceof Dog;
	}
	
	public static boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
