/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stephen
 */
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
public class test {
    public static void main(String[] args){
        FileBasketBallPlayers thing1=new FileBasketBallPlayers("joeNutz",75,120);
        //FileBasketBallPlayers thing2=new FileBasketBallPlayers("BenDover",34,70);
        thing1 = new FileBasketBallPlayerAccessories(thing1,"wristband",2,8);
        
        FileOperations fileMgr=new FileOperations();
        fileMgr.getFileName("data.json");
        //fileMgr.addNewPlayer(thing2);
        //fileMgr.addNewPlayer(thing1);
        //fileMgr.removeAPlayer("joeNutz");
        //fileMgr.addNewAccessory(thing1);
        //fileMgr.removeAnAccessory("wristband");
        FileBasketBallPlayerAccessories thing2 = fileMgr.getFileAccessory("wristband");
        
        System.out.println(thing2.getFileCost());
    }
}
