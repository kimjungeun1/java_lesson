package koreait.day13;

public class MyClassX implements InterfaceA{
@Override
public void methodA() {
System.out.println("myClassX methodA");
	
}
@Override
	public int methodB(int num) {
	System.out.println("myClassX methodB:"+num);
	return 999;
	}

}
