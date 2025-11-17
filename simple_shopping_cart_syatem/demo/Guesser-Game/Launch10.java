
import java.util.Scanner;
class Guesser{
	int guessNum;
	public int guessingNum()
	{
		//System.out.println("Guesser please kindely gess the number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser please kindely gess the number");
		guessNum=sc.nextInt();
		return guessNum;
		
	}
}
class Player{
	int guessNum;
	public int guessingNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("player please kindely guess the number");
		guessNum=sc.nextInt();
		return guessNum;
		
	}
}
class Umpire{
	int guesserNum;
	int playerNum1;
	int playerNum2;
	int playerNum3;
	
	 void collectGuesserNum() {
		Guesser g = new Guesser();
		g.guessingNum();
		guesserNum= g.guessNum;
		
	}

     void collectPlayerNum() {
    	 Player p1=new Player();
    	 p1.guessingNum();
    	 playerNum1=p1.guessNum;
    	 
    	 Player p2=new Player();
    	 p2.guessingNum();
    	 playerNum2=p2.guessNum;
    	 
    	 Player p3=new Player();
    	 p3.guessingNum();
    	playerNum3=p3.guessNum;
     }
     void compare(){
    	 if(guesserNum==playerNum1) {
    		 if(guesserNum==playerNum2 && guesserNum==playerNum3) {
    			 System.out.println("sare jeet gaye bhai!!");
    		 }
    		 else if(guesserNum==playerNum2) {
    			 System.out.println("palyer 1 and player 2 jeet gaye bhai!!");
    		 }
    		 else if(guesserNum==playerNum3) {
    			 System.out.println("player 1 and player 3 won the game");
    		 }
    		 else {
    			 System.out.println(" Only player 1 won the game");
    		 }
    	 }
    	 else if(guesserNum==playerNum2) {
    		 if(guesserNum==playerNum3) {
    			 System.out.println("player 3 and player 3 won the game");
    		 }
    		 else {
    			 System.out.println("only player 2 won the game");
    		 }
    	 }
    	 else if(guesserNum==playerNum3) {
    		 System.out.println("only player 3 won the game");
    	 }
    	 else {
    		 System.out.println("game loss no one gaess the correct answer");
    	 }
     }

}
public class Launch10 {

	public static void main(String[] args) {
		Umpire u =new Umpire();
		u.collectPlayerNum();
		u.collectGuesserNum();
		u.compare();
		
		
	}

}

