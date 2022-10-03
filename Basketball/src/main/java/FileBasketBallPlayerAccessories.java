/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stephen
 */
public class FileBasketBallPlayerAccessories extends BasketBallPlayerAccessories{
    private String name;
    private int cost;
    private int pointsPerGame;
    public FileBasketBallPlayerAccessories(BasketBallPlayers b, String n, int c,int ppg){
        player=b;
        name=n;
        cost=c;
        pointsPerGame=ppg;
        
    }
    public String getDescription(){
        return (player.getDescription()+" "+name);
    }
    public int getCost(){
        return (player.getCost()+cost);
    }
    public int getPointsPerGame(){
        return (player.getPointsPerGame()+pointsPerGame);
    }
    public String getFileName(){
        return name;
    }
    public int getFileCost(){
        return cost;
    }
    public int getFilePointsPerGame(){
        return pointsPerGame;
    }
}
