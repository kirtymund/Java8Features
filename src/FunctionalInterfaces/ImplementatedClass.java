package FunctionalInterfaces;

public class ImplementatedClass implements A,B{

	
	public static void main(String[] args) {
		ImplementatedClass implementatedClass = new ImplementatedClass();
		implementatedClass.m1();
		
	}

	@Override
	public void m1() {
		A.super.m1();
	}

}
interface A{
	default void m1() {
		System.out.println("A");
	}
}
interface B{
	default void m1() {
		System.out.println("B");
	}
}