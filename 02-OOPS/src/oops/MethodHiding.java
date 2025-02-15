package oops;

class Parent {
    static void show() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    static void show() { // Method hiding, not overriding
        System.out.println("Child's static method");
    }
}

public class MethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
        p.show();  // Calls Parent's static method (not Child's)
	}
}