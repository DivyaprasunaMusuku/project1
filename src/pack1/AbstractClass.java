package pack1;
public abstract class AbstractClass {
	abstract void example();
	public void method1() {
		System.out.println("This is example for abstract class");
	}
}
 class SubAbstract extends AbstractClass {
	public void method2()
	{
		System.out.println("this is SubAbstract class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubAbstract obj= new SubAbstract();
		obj.method1();
		obj.method2();
        obj.example();
         
	}
	void example() {
		System.out.println("Abstract method has no defination");
	}

}
