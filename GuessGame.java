import java.util.Random;

public class GuessGame {
    
    Random r = new Random();
    public boolean won = false;
    boolean all;
    Player P1;
    Player P2;
    Player P3;
    
    public void startGame() {
        boolean b1 = false, b2 = false, b3 = false;
        byte guess;
        byte p1 = -1, p2 = -1, p3 = -1;
        
        P1 = new Player();
        P2 = new Player();
        P3 = new Player();

        p1 = P1.guess();
        p2 = P2.guess();
        p3 = P3.guess();

        b1= false;
        b2= false;
        b3= false;
        all= false;
        // System.out.println("Welcome to the Guessing game");
        // System.out.println("Let me guess");
        guess = ((byte) r.nextInt(1, 8));
        // System.out.println("I guessed " + guess);

        // System.out.println("Player 1 guessed : " + this.p1);
        // System.out.println("Player 2 guessed : " + this.p2);
        // System.out.println("Player 3 guessed : " + this.p3);

        if (guess == p1) {
            // System.out.println("Player 1 won!");
            b1 = true;
        } 
        if (guess == p2) {
            // System.out.println("Player 2 won!");
            b2 = true;
        } 
        if (guess == p3) {
            // System.out.println("Player 3 won!");
            b3 = true;
        } 
        if (!b1 && !b2 && !b3) {
            // System.out.println("Nobody won!");
        }
        if(b1==true && b2==true && b3==true){
            // System.out.println("All of them won");
            all=true;
        }
    }
}
