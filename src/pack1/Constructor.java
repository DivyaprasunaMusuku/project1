package pack1;

public class Constructor {
	String eName;
	String eId;
	int sal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor Employee=new Constructor("Shashu","Quali34",90000);
Employee.display();
Constructor Employee1=new Constructor("Vinni","Quali38",670000);
Employee1.display();
	}
Constructor(String eName_1,String eId_1,int sal_1){
	eName=eName_1;
	eId=eId_1;
	sal=sal_1;
}
void display() {
	System.out.println("Emploee name is:"+eName);
	System.out.println("Employee Id is :"+eId);
	System.out.println("Employee salaryis :"+sal);
}
}
