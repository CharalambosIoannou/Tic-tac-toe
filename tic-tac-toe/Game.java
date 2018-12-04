import java.util.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    ArrayList<Integer> xcoord = new ArrayList<Integer>();
    ArrayList<Integer> ycoord = new ArrayList<Integer>();
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {

    }
    
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    

    public static void main(String[] args){
        Game g= new Game();
        System.out.println("1.Play human vs human");
        System.out.println("2.Play human vs computer");
        System.out.println("3.Play computer vs computer");
        Scanner s2= new Scanner (System.in);
        int choice=s2.nextInt();
        switch (choice){
            case 1: 
                        TicTacToe t = new TicTacToe();
                        Player p1= new Player();
                        System.out.println("Enter player 1 name: ");
                        Scanner s0 = new Scanner(System.in);
                        p1.setName(s0.next());
                        
                        Player p2= new Player();
                        System.out.println("Enter player 2 name: ");
                        Scanner s1 = new Scanner(System.in);
                        p2.setName(s1.next());
                        
                        int rand= getRandomNumberInRange(0,1);
                        System.out.println(rand);
                        t.printBoard();
                        if (rand==1){
                            while (true){
                        System.out.println("Enter coordinates to enter mark: ");
                       
                        Scanner s = new Scanner(System.in);
                        int x= s.nextInt();
                        int y= s.nextInt();
                        t.placeMark(x,y);
                        t.printBoard();
                        if (t.checkForWin()==true){
                            System.out.println(p1 + " is the winner");
                            return;
                        }
                        if (t.isBoardFull()==true){
                            System.out.println("Match is draw board is full");
                            return;
                        }
                        t.changePlayer();
                    }
                        }
                        
                        if (rand==0){
                            while (true){
                        System.out.println("Enter coordinates to enter mark: ");
                        Scanner s = new Scanner(System.in);
                        int x= s.nextInt();
                        int y= s.nextInt();
                        t.placeMark(x,y);
                        t.printBoard();
                        if (t.checkForWin()==true){
                            System.out.println(p2 + " is the winner");
                            return;
                        }
                        if (t.isBoardFull()==true){
                            System.out.println("Match is draw board is full");
                            return;
                        }
                        t.changePlayer();
                    }
                        }
                        
                        break;
                        
                case 2:
                
                break;
                
                case 3:
                g.playComputer();
                break;
                        }
                       
                        
                        
                        
        
        
    }
    
    public void playComputer(){
             TicTacToe t = new TicTacToe();
                        Player p1= new Player();
                        System.out.println("Enter player 1 name: ");
                        Scanner s0 = new Scanner(System.in);
                        p1.setName(s0.next());
                        
                        Player p2= new Player();
                        System.out.println("Enter player 2 name: ");
                        Scanner s1 = new Scanner(System.in);
                        p2.setName(s1.next());
                        
                        int rand= getRandomNumberInRange(0,1);
                        System.out.println(rand);
                        t.printBoard();
                        if (rand==1){
                             System.out.println("Player " + p1 + " goes first and is x");
                            while (true){
                               
                        System.out.println("Enter coordinates to enter mark: ");
                       
                        Scanner s = new Scanner(System.in);
                        
                        int x= getRandomNumberInRange(0,2);
                        int y= getRandomNumberInRange(0,2);
                 System.out.println("x:" + x);
                        System.out.println("y:" + y);
                        t.placeMarkComp(x,y);
                        t.printBoard();
                          t.changePlayer();
                        if (t.checkForWin()==true){
                            System.out.println(p1 + " is the winner");
                            return;
                        }
                        if (t.isBoardFull()==true){
                            System.out.println("Match is draw board is full");
                            return;
                        }
                      
                    }
                        }
                        
                        if (rand==0){
                            System.out.println("Player " + p2 + " goes first and is x");
                            while (true){
                                
                        System.out.println("Enter coordinates to enter mark: ");
                        Scanner s = new Scanner(System.in);
                        int x= getRandomNumberInRange(0,2);
                        int y= getRandomNumberInRange(0,2);
                        System.out.println("x:" + x);
                        System.out.println("y:" + y);
                        t.placeMarkComp(x,y);
                        t.printBoard();
                        t.changePlayer();
                        if (t.checkForWin()==true){
                            System.out.println(p2 + " is the winner");
                            return;
                        }
                        if (t.isBoardFull()==true){
                            System.out.println("Match is draw board is full");
                            return;
                        }
                        
                    }
                        }
    }
}
