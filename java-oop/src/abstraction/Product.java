package abstraction;
/**
 * @file_name : Product.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 1.
 * @Story	  : 제품을 추상클래스로 만든 예제
 */
public abstract class Product {
	protected String company,name,serialNo;
	
	public void setProdictInfo(String company, String name, String serialNo){ //구상메소드 concrete method
		this.company = company;
		this.name =  name;
		this.serialNo = serialNo; //생성자가 하는 일을 대신.
	}
	public abstract String display(); // 추상메소드 {}<- 바디가 없으면.  abstract method
}
