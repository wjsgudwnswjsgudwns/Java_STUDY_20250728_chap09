package java_ch09_20250728;

public class MainClass {

	public static void main(String[] args) {

		A a = new A();
	
		A.B b = a.new B(); // b 객체 생성
		b.field1 = 10;
		b.method();
		
		A.C c = new A.C(); 
		c.field1 = 100;
		c.method1();
		A.C.field2 = 10;
		A.C.method2();
		
		a.methodLocal();
		
	}

}
