package koreait.day08;

public class MyClass1 {

	private int age;	//�ڹ��� Ư��: ���м�(��м�)�� Ŭ������ �ʵ尪�� �ٸ�Ŭ������ ���� �������� ���ϵ��� �մϴ�.(ĸ��ȭ)
	  private String name;
	public double point;

//	private �ʵ�� setter, getter�� �־�� �ٸ� Ŭ�������� �б� �� �� ����
		
	 public void setAge(int age) {
		if(age>1&&age<=150)
		this.age= age;
		else
			System.out.println("�߸��� ���Դϴ�.");
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}

/*
 *  private int age;			//private  : �ٸ� Ŭ�������� ��� ���մϴ�. ��(���� Ŭ����)�� ����Ѵ�.
		String name;				//default(package)  : �ٸ� ��Ű������ ��� ���մϴ�. �̿��̸� ���̾���.
		public int score;			//public   : ��𼭳� ����մϴ�.������,������... �ٰ��� ����.

 *  private , default, protected, public�� 
 *  ����(�ʵ�),�޼ҵ�,������, Ŭ���� � ���Ǵ� ���������� �Դϴ�.(Ŭ������ ���������� default,public �� ����մϴ�.)
 */