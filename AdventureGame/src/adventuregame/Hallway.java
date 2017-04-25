/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author Arne
 */
public class Hallway implements IRoom{
    
    //Sets the room description and title for the rooms
    private String roomDescription;
    private String roomTitle;
    
    //Empty Contructor
    public Hallway(){}
    
    //Constructor with Parameters
    public Hallway(String roomDescription, String roomTitle){
        setRoomDescription(roomDescription);
        setRoomTitle(roomTitle);
    }
    
    //Getters and Setters for the Description and Title
    
    public String getRoomDescription() {
        
    }

  
    public void setRoomDescription(String roomDescription) {
        
    }

   
    public String getRoomTitle() {
        
    }

    
    public void setRoomTitle(String roomTitle) {
        
    }
    
    //Methods
    public void Continue(Hallway h1){
        
    }
    public void goBack(Hallway h1){
        
    }
    
}
