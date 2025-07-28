package chap09.part02;

public class MainClass {
	
	public static void operate(Calculator cal) {
		System.out.println("연산 결과 : " + cal.add(10, 20));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//추상 클래스를 상속한 익명 객체
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("멍멍");
				
			}
			
			@Override
			public void run() {
				System.out.println("깡총");
				
			}
		};
		
	animal.sound();
	animal.run();
		
	
	System.out.println("==================");
	
	// 메소드의 배개변수로 익명 개체 전잘
	
	operate(new Calculator() { // Calculator 로 만든 객체만 인수로 넣을수 있지만 인터페이스는 객체를 만들수 없기 때문에 불가능함.
		
		@Override
		public int add(int a, int b) {
			return a + b; // a+b 리턴
			}
		} ); 
	
	}

}
