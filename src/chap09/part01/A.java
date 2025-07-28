package chap09.part01;

public class A {

	public A() {
		System.out.println("A 객체가 생성됨");
	}
	
	//맴버 클래스 B
	public class B {
		public B () {
			System.out.println("B 객체가 생성됨");			
			}
		int field1;
		public static void method() {
	}
	}	
		
	//정적 클래스 C
	public static class C {
		public C() {
			System.out.println("C 객체가 생성됨");
		}
		
		int field1;
		static int field2;
		void method1 (){
			
		}
		static void method2 (){
		}
	}
	
	//로컬클래스
	public void methodLocal() {
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method() {
				
			}
		}
		D d = new D();
		d.field1 = 30;
		d.method();
	}
	
}
