package pack1;

public interface Interface {
	void v1();
	void v2();

}
class Interface1 implements Interface{
	public static void main(String []args) {
		Interface1 obj=new Interface1();
		obj.v1();
		obj.v2();
	}
	public void v1() {
		System.out.println("This is an Interface Example");
		
	}
	public void v2()
	{
	System.out.println("It is a Sub Interface");
}
}