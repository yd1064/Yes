package OK;

public class E05_StaticTest {
	//staic
	//멤버변수, 메소드에 사용!, 지역변수에 놉!
	//멤버변수에 static은 데이터형 왼쪽에 기술하고
	//멤버변수를 접근할 때 객체를 생성하지 않고 클래스명.멤버변수(or필드)로 접근이 가능하다.
	//객체를 여러개 만들더라도 static변수는 한개만 존재한다. ->싱글톤
	//모든곳에서 값을 변경하기 위해 Static을 사용하는듯?
	// static을 호출할때 -> 클래스명.static변수을 사용 -> E05_StaticTest.local
	int num = 10;
	String name = "홍길동";
	static String local = "강남구";
	
	public E05_StaticTest() {
	}
	
	//메소드에 static 만들기
	//객체를 만들지 않고 호출하여 사용할 수 있다.
	static public void testMethod() {
		int a = 500;
		// 같은 클래스 static변수이므로 클래스명을 생략가능하다.
		System.out.println("local->"+local);
		System.out.println(Math.PI);
	}	
	//static이 없는 변수를 사용하기 위해서는 객체를 만들어야한다.
	public void print() {
		System.out.println("num->"+num);		
	}
	
	public static void main(String[] args) {
		E05_StaticTest st1 = new E05_StaticTest();
		E05_StaticTest st2 = new E05_StaticTest();
		E05_StaticTest st3 = new E05_StaticTest();
		//값변경
		st2.local = "영등포구";
		System.out.println("st1->"+st1.local);
		System.out.println("st3->"+st3.local);
		System.out.println(E05_StaticTest.local);
		System.out.println("pi->"+Math.PI);
		
		st1.print();//객체명(클래스명).static변수
		// testMethod()는 static 메소드이므로 1개만 존재하고 클래스명.메소드명으로 호출할 수 있다.
		// E05_StaticTest에 있는 testMethod를 실행
		E05_StaticTest.testMethod();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
