package casting;

public class Child extends parent {
	int a=21;
	public void m2()
	{
		System.out.println("Inside child class method ");
	}
	public static void main(String[] args) {
		parent a1=new Child(); // Implicit up casting 
		a1.m1();
		System.out.println(a1.pet);
		parent a2=(parent)new Child(); // Explicit up casting
		System.out.println(a2 instanceof Child);
		
		
		Child a3=(Child)a1;
		a3.m1();
		a3.m2();
		System.out.println(a3.a);
		System.out.println(a3.pet);
		/*
		 *  Up casting--> className(parent) reference_variable = new class_name(child); // Implicit
		 *  explicit--> class_name(parent) ref_variable = (parent_class_name) new class_name(child);
		 *  
		 *   Down_Casting --> It is only done after up casting and it can be done explicitly
		 *   Child_class ref_variable = (Child_class) ref_variable o up casting 
		 *   
		 *   
		 */
		
		
	}
	
	

}
