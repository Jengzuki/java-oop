package encapsule;
/**
 * @file_name : Kaup.java
 * @author	  : apfl1@naver.com
 * @date      : 2015. 9. 23.
 * @story     : 인스턴스 변수
 */
public class Kaup {
	
	private String name;      //경비실과 같은.
	private double height;
	private double weight;
	private String messege;
	
	//private 는 저장이 되지 않음.
	// ALT + SHIFT + S 
	
	
	//비만 측정
	public String getResult() {
		String result = "";
		int iex = (int)((weight/(height*height)*10000));
		if (iex >= 30) {
			result = "비만";
		} else if (iex >= 24) {
			result = "과체중";
		} else if (iex >= 20) {
			result = "정상";
		} else if (iex >= 15) {
			result = "저체중";
		} else if (iex >= 13) {
			result = "마름";
		} else if (iex >= 10) {
			result = "영양실조";
		} else if (iex < 10) {
			result = "소모증";
		}
		return result;
	}


	public String getName() {
		return name;
	}


	public double getHeight() {
		return height;
	}


	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}
}
