package abstraction;

public class Himart {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setTVInfo("LG", "TV", "lg1234", "50inch", "올레드");
		Computer computer = new Computer();
		computer.setcomputerInfo("삼성", "컴퓨터", "SM1234", "512GHz","8G", "1TB");
		SmartPhon smartPhon = new SmartPhon();
		smartPhon.setSmartPhonInfo("샤오미", "스마트폰", "s-1234", "1024만화소", "500g");
		Product[] cart = new Product[3];
		cart[0] = tv;
		cart[1] = computer;
		cart[2] = smartPhon;
		
		for (int i = 0; i < cart.length; i++) {
			System.out.println(cart[i].display());
		}
	}
}
