package inherit_ex;

class Parent {
	int num = 10;
}

class Child extends Parent {
	int num = 20;
}
public class Sample {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.num);
	}
}
