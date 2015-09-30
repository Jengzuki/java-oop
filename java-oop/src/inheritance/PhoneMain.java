package inheritance;

import java.util.Scanner;

/**
 * @file_name : Phone.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 30.
 * @Story	  : 상속예제
 */
public class PhoneMain { // 퍼블릭은 메인 메소드. 단 하나만 있어야함
	//프로젝트 > 패키지 >클레스 > 메소드 > 구문 
	/**
	 *  
	 */
	public static <phone> void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 인스턴스 => 참조변수
		Phone androidPhone = new AndroidPhone();
		System.out.println("구매할 사이즈 선택");
		String size = scanner.next();
		System.out.println("안드로이드 폰으로 통화할 사람.");
		String name2 = scanner.next();
		System.out.println("보낼 메세지입력");
		String msg2 = scanner.next();
		((AndroidPhone) androidPhone).setDate(msg2, name2, size);
		System.out.println(((AndroidPhone) androidPhone).getDate());
		
		
		System.out.println(" ------ ");
		
		Phone iphone = new Iphone();
		System.out.println("아이폰으로 통화할사람.");
		String name = scanner.next();
		System.out.println("보낼 메세지입력");
		String msg = scanner.next();
		((Iphone) iphone).setDate(msg, name);
		System.out.println(((Iphone) iphone).getDate());
		
		System.out.println(" ---------");
		
		Phone nokia = new Celphone();
		nokia.setCompany("노키아");
		System.out.println(((Phone) nokia).getCompany()+"를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
		
		System.out.println( " --------- ");
		
		Phone phone = new Phone(); // 타입 인스턴스(객체) = new 생성자
		phone.setCompany("삼성 집전화기");
		System.out.println(phone.getCompany()+"를 사용합니다.");
		System.out.println("통화할 사람");
		phone.setCall(scanner.next());
		System.out.println(phone.getCall());
	}
}

class AndroidPhone extends Iphone{
	public static String BRAND = "안드로이드폰"; // 오버라이딩
	private String size;
	private String date;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public void setDate(String date,String name, String size) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.setSize(size);
		this.date = super.getCompany()+"\t"+ super.isPortable()+"\t"+ super.getCall()+"\t"+
		"대화면 "+this.getSize()+"로 볼 수 있음\t"+date+": 카톡메시지 전달";
	}
	@Override
	public String getDate() {
		return date;
	}
}

class Iphone extends Celphone{
	private String date; // 인스턴스 변수
	public static String BRAND = "아이폰"; 
	//static은 고정된 이란 의미로 static이 붙은 변수는 클래스 변수라고도 한다. 
	// 클래스 변수 = static 변수
	public static boolean TRUE = true;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	//@Override = 상속 
	
	public void setDate(String date, String name) { //오버로딩. 
		super.setCompany(BRAND); //애플은 여러브랜드를 만들지 않고 무조건 아이폰 이라 한다.
		super.setPortable(TRUE); // 애플은 집전화기는 안만들고 무조건 휴대폰만 만든다.
		super.setCall(name);
		this.date = 
				super.getCompany()+"\t"+super.isPortable()+"\t"+super.getCall()+"\t"+date+" : 메시지 전달";
		
	}
}

class Phone{
	private String company, call; //인스턴스(의) 변수 => 힙 영역
	double TAX_RATE = 0.095; // 스테틱 변수 => 전역변수(글로벌~) => 스테틱 영역
	
	//ALT + SHIFT + S + R
	public String getCompany() {
		return company; 
	}

	public String getCall() {
		return call;
	}

	public void setCompany(String company) {
		this.company = company; // 지역(의) 변수 => 스텍영역
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
}

class Celphone extends Phone{
	private boolean portable; // 이동성, 가지고 다닐 수 있느냐 없느냐.
	private String move;
	
	
	public boolean isPortable() {
		return portable;
	}
	public String getMove() {
		return move;
	}
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		this.portable = portable;
	}
	public void setMove(String move) {
		this.move = move;
	} 

}
