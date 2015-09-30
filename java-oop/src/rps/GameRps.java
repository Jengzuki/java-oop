package rps;
/**
 * @file_name : GameRps.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 30.
 * @Story	  : 
 */
public class GameRps {
	int rock;// 바위
	int paper; //보자기
	int scissors;; //가위
	int comVal; //컴퓨터가 생성하는 랜덤 가위바위보
	String rpsVal; //숫자와 대뜸되는 값
	
	public int getRock() {
		return rock;
	}
	public int getPaper() {
		return paper;
	}
	public int getScissors() {
		return scissors;
	}
	public String getRpsVal() {
		return rpsVal;
	}
	public void setRock(int rock) {
		this.rock = rock;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	public void setScissors(int scissors) {
		this.scissors = scissors;
	}
	public void setRpsVal(int val) {
		switch (val) {
		case 1: rpsVal = "가위";	break;
		case 2: rpsVal = "바위";	break;
		case 3: rpsVal = "보";	break;
		default:
			break;
		}
	}
	public int getComVal() {
		return comVal;
	}
	public void setComVal() {
		this.comVal = (int)(Math.random()*3+1);
	}
	
	
}
