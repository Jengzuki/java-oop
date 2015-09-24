package encapsule;

public class Casino {
	private String winner;
    private String looser ;  
    
    public Casino(Card p1, Card p2){
           if ( p1.getNumber()> p2.getNumber()) {
                 //this.winner = p1.getName();
                 //this.looser = p2.getName();
                      setWinner( p1.getName());
                      setLooser( p2.getName());
          } else {
                 this. winner = p2.getName();
                 this. looser = p1.getName();
          }
    }

    public String getWinner() {
           return winner;
    }

    public String getLooser() {
           return looser;
    }

    public void setWinner(String winner ) {
           this. winner = winner;
    }

    public void setLooser(String looser ) {
           this. looser = looser;
    }

    public String toString() {
           return winner + "가" + looser + "를 이겼습니다." ;
    }
}


