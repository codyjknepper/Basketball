/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stephen
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class FileOperations {
    String fileName;
    public void getFileName(String s){
        fileName=s;
    }
    public void addNewAccessory(FileBasketBallPlayerAccessories access){
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader(fileName)){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray list= (JSONArray) obj;
            
            JSONObject content = new JSONObject();
            content.put("name",access.getFileName());
            content.put("cost",access.getFileCost());
            content.put("pointspergame", access.getFilePointsPerGame());
            JSONObject Accessories = new JSONObject();
            Accessories.put("Accessories",content);
            list.add(Accessories);
            
            try (FileWriter file = new FileWriter(fileName)) {
            //writting the JSONstring to 
                file.write(list.toJSONString()); 
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
             //if the file is empty
            JSONArray list=new JSONArray();
            JSONObject content = new JSONObject();
            content.put("name",access.getFileName());
            content.put("cost", access.getFileCost());
            content.put("pointspergame", access.getFilePointsPerGame());
            JSONObject Player = new JSONObject();
            Player.put("Player",content);
            list.add(Player);
            
            try (FileWriter file = new FileWriter(fileName)) {
            //writting the JSONstring to 
                file.write(list.toJSONString()); 
                file.flush();
            } catch (IOException j) {
                j.printStackTrace();
            } 
        }
    }
    public boolean removeAnAccessory(String s){
        JSONParser jsonParser = new JSONParser();
        int count=0;
        int size=0;
        try(FileReader reader = new FileReader(fileName)){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject getObject;
            JSONArray list= (JSONArray) obj;
            size=list.size();
            while(count<size){
                getObject=(JSONObject)list.get(count);
                if((getObject=(JSONObject)getObject.get("Accessories"))!=null){
                    if(((String)getObject.get("name")).equals(s)){
                        list.remove(count);
                        break;
                    }
                }
                count++;
            }
            if(size==count){
                return false;
            }
            try (FileWriter file = new FileWriter(fileName)) {
            //writting the JSONstring to 
                file.write(list.toJSONString()); 
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    public void addNewPlayer(FileBasketBallPlayers ballPlayer){
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader(fileName)){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray list= (JSONArray) obj;
            
            JSONObject content = new JSONObject();
            content.put("name",ballPlayer.getDescription());
            content.put("cost", ballPlayer.getCost());
            content.put("pointspergame", ballPlayer.getPointsPerGame());
            JSONObject Player = new JSONObject();
            Player.put("Player",content);
            list.add(Player);
            
            try (FileWriter file = new FileWriter(fileName)) {
            //writting the JSONstring to 
                file.write(list.toJSONString()); 
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            //if the file is empty
            JSONArray list=new JSONArray();
            JSONObject content = new JSONObject();
            content.put("name",ballPlayer.getDescription());
            content.put("cost", ballPlayer.getCost());
            content.put("pointspergame", ballPlayer.getPointsPerGame());
            JSONObject Player = new JSONObject();
            Player.put("Player",content);
            list.add(Player);
            
            try (FileWriter file = new FileWriter(fileName)) {
            //writting the JSONstring to 
                file.write(list.toJSONString()); 
                file.flush();
            } catch (IOException j) {
                j.printStackTrace();
            } 
        }
    }
    public boolean removeAPlayer(String s){
        JSONParser jsonParser = new JSONParser();
        int count=0;
        int size=0;
        try(FileReader reader = new FileReader(fileName)){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject getObject;
            JSONArray list= (JSONArray) obj;
            size=list.size();
            while(count<size){
                getObject=(JSONObject)list.get(count);
                if((getObject=(JSONObject)getObject.get("Player"))!=null){
                    if(((String)getObject.get("name")).equals(s)){
                        list.remove(count);
                        break;
                    }
                }
                count++;
            }
            if(size==count){
                return false;
            }
            try (FileWriter file = new FileWriter(fileName)) {
            //writting the JSONstring to 
                file.write(list.toJSONString()); 
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    public FileBasketBallPlayerAccessories getFileAccessory(String s){
        JSONParser jsonParser = new JSONParser();
        int count=0;
        int size=0;
        int cost=0;
        int points=0;
        
        JSONObject getObject;
        try(FileReader reader = new FileReader(fileName)){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray list= (JSONArray) obj;
            size=list.size();
            //add code specific to get the accessories and add them to an object
            while(count<size){
                getObject=(JSONObject)list.get(count);
                if((getObject=(JSONObject)getObject.get("Accessories"))!=null){
                    if(((String)getObject.get("name")).equals(s)){
                        break;
                    }
                }
                count++;
            }
            if(count==size){
                return null;
            }
            else{
                getObject=(JSONObject)list.get(count);
                getObject=(JSONObject)getObject.get("Accessories");
                //parse the items into an object
                cost=(int)((long)getObject.get("cost"));
                points=(int)((long)getObject.get("pointspergame"));
                FileBasketBallPlayerAccessories retAccess= new FileBasketBallPlayerAccessories(null,(String)getObject.get("name"),cost,points);
                return retAccess;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            return null;
        }
        return null;
    }
    public boolean saveCreatedPlayer(){
        return true;
    }
}
