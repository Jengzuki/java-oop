package abstraction;

public class SmartPhon extends Product{
	protected String camera, weight ;

	public void setSmartPhonInfo(String company, String name, String serialNo,
			String camera, String weight) {
		super.setProdictInfo(company, name, serialNo);
		this.camera = camera;
		this.weight = weight;
	}
	
	@Override
	public String display() {
		
		return "제조회사 : "+super.company+"\n "
				+ "제품명 : "+super.name+"\n "
				+ "고육번호 : "+super.serialNo+" \n"
				+ "CAMERA : "+this.camera+"\n"
				+ "WEIGHT : "+this.weight;
	}
}
