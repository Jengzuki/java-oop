package encapsule;

import java.util.Scanner;

public class CardMain {

public static void main(String [] args ) {
   
	Scanner scanner = new Scanner(System. in);
    System. out.println( "플레이어 이름 두명을 입력" );
     String name1 = scanner.next();
     String name2 = scanner.next();

    Card p1 = new Card();
    Card p2 = new Card();
     p1.setName( name1);
     p2.setName( name2);
    System. out.println( p1.getNumber());
    System. out.println( p2.getNumber());
    Casino casino = new Casino( p1, p2);
    
    System. out.println( casino.toString());
    
    
    
          
     //클레스 인스턴스 = new 생성자(인자);
     // 카지노 생성자 인자로 카드객체 두개를 집어넣어라.
     // 카지노 생성자에서 두 카드 객체의 숫자를 비교해서
     // 위너, 루저인스턴스 변수에 할당하고
     // toString 으로 출력해라.
                      
}
public String toString() {
     return super.toString();
}
}
