package rps;
/**
 * @file_name : GameRpsValudation.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 30.
 * @Story	  : 유효성 체크 클레스
 */
public class GameRpsValudation {
	public String ShowRange(int a, int b){
		return a + "부터" + b + "까지의 값만 입력하셔야합니다.";
	}
	private String showInt() {
		return "정수값만 입력하세요";
	}
}