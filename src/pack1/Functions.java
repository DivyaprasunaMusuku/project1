package pack1;

public class Functions {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Functions obj=new Functions();
  obj.add(56, 30);
  
  double addn=obj.addition(67.99f, 34.567899876);
  System.out.println("Addition is :"+addn);
 
  int sub=obj.sub(40,20);
  System.out.println("subtraction is " +sub);
  
  obj.difference(59, 69);
  
  int multi=obj.multiplication(34,90);
  System.out.println("Multiplication is:" +multi);
	}
	
void add(int x,int y) {
	int sum=x+y;
	System.out.println("Addition is :"+sum);
}
double addition(float x,double y) {
	double result=x+y;
	return(result);	
}
int sub(int x,int y) {
	int result=x-y;
	return(result);
}
void difference(int x,int y) {
	int sub=x-y;
	System.out.println("difference is "+sub);
}
int multiplication(int x,int y) {
	int mul=x*y;
	return(mul);
}
}
