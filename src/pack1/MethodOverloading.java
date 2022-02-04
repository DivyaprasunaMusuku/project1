package pack1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading obj=new MethodOverloading();
obj.sub(78, 76);
obj.sub(89, 34.78f);
obj.sub(45.89f,67.90f);
double y=obj.sub(45.899, 56.9877);
System.out.println("Subtraction is :" +y);
	}
void sub(int x,int y) {
	int result=x-y;
	System.out.println("subtraction is :" +result);
}
void sub(int x,float y) {
	float result=x-y;
	System.out.println("Subractio is:"+result);
}
void sub(float x,float y) {
	float result=x-y;
	System.out.println("Subtraction is :"+result);
}
double sub(double x,double y) {
	double result=x-y;
	return(result); 
}
}


