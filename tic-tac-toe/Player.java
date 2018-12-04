import java.util.*;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    TicTacToe t = new TicTacToe();

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {

    }
    public void setName(String name){
        this.name=name;
    }
    
    public String toString(){
        return name;
    }
}
