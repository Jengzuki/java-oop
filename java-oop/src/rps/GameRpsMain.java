package rps;

import java.util.Scanner;

public class GameRpsMain {
	public static void main(String[] args) {
		/**
		 * 결과
		 * 컴퓨터는 바위이고 당신은 가위이므로 컴퓨터가 이겼습니다.
		 */
		System.out.println("가위 바위 보 게임을 시작합니다.");
		GameRpsService service = new GameRpsServiceImpl(); // 깊은 복사 (deep copy)
		GameRpsValudation valid = new GameRpsValudation();
		GameRps rps = new GameRps();
		Scanner scanner = new Scanner(System.in);
		int start=1, limit=3;
		while (true) {
			System.out.println("가위: 1 바위: 2 보자기: 3 을 입력하세요");
			int userVal = scanner.nextInt();
			if (userVal<start || userVal>limit) {
				System.out.println(valid.ShowRange(start, limit));
				continue;
			}
			rps.setComVal();
			System.out.println(service.playGame(userVal, rps.getComVal()));
				}
	}
}
