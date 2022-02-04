package pack1;

public class SingleInheritence {
	void animals() {
		System.out.println("Animals include Wild and Domestic");
	}
}
 class Child extends SingleInheritence{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Child obj=new Child();
			obj.animals();
			obj.wildAnimals();
		}
		public void wildAnimals() {
			System.out.println("Lions are roaring");
			
		}
	}


