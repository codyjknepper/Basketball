/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stephen
 */
public class FileBasketBallPlayers extends BasketBallPlayers {
    private int cost;
    private int pointsPerGame;
    
    public FileBasketBallPlayers(String s,int c,int ppg){
        playerDescription=s;
        cost=c;
        pointsPerGame=ppg;
    }
    public String getDescription(){
        return playerDescription;
    }
    public int getCost(){
        return cost;
    }
    public int getPointsPerGame(){
        return pointsPerGame;
    }
}
