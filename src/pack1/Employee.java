package pack1;

public class Employee {
String Ename;
String Eid;
int sal;
static String companyname="QualiZeal";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee E1=new Employee() ;
E1.eDetails("Divyaprasuna", "QUALI23", 3456);
E1.display();
Employee E2=new Employee();
E2.eDetails("Humera", "QUALI24", 3457);
E2.display();
Employee E3=new Employee();
E3.eDetails("Ashwini", "QUALI26", 3458);
E3.display();
	}
void eDetails(String Ename_temp,String Eid_temp,int sal_temp) {
	Ename=Ename_temp;
	Eid=Eid_temp;
	sal=sal_temp;
}
void display() {
	System.out.println("Emploee name is:"+Ename);
	System.out.println("Employee Id is :"+Eid);
	System.out.println("Employee salaryis :"+sal);
	System.out.println("Companyname is:"+companyname);
}
}