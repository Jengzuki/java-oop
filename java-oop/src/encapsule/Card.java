package encapsule;

public class Card {


//멤버 필드

public String kind = "하트"; // 카드의 무늬 (스페이드, 다이아, 하트, 클럽)
private int number; // 카드의 넘버(1~13)
private String name;
static int width = 100; // 카드 가로
static int herght = 100; // 카드 세로


public Card(){
       this. kind = "하트";
       this. number = ( int)((Math. random()*10)+1);
      }

public String getKind() {
       return kind;
}
public int getNumber() {
       return number ;
}
public void setKind(String kind) {
       this. kind = "하트";
}
public void setNumber() {
       this.number = number ;
      }

public String getName() {
       return name;
}

public void setName(String name) {
       this. name = name;
}

@Override
public String toString() {
       return super.toString();
}

}
