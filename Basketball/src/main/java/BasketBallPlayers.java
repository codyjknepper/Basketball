/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stephen
 */
public abstract class BasketBallPlayers {
    String playerDescription = "Unknown Player";
    
    public String getDescription(){
        return playerDescription;
    }
    
    public abstract int getCost();
    public abstract int getPointsPerGame();
}
