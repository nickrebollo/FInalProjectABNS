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
    public Hallway(String roomTitle, String roomDescription){
        setRoomDescription(roomDescription);
        setRoomTitle(roomTitle);
    }
    
    //Getters and Setters for the Description and Title

    @Override
    public String getRoomDescription() 
    { return roomDescription; }

    @Override
    public void setRoomDescription(String roomDescription) 
    { this.roomDescription = roomDescription; }

    @Override
    public String getRoomTitle() 
    { return roomTitle; }

    @Override
    public void setRoomTitle(String roomTitle) 
    { this.roomTitle = roomTitle; }
    
    //Methods
    public void Continue(int condition){
        condition++;
    }
    public void goBack(int condition){
        condition --;
    }
    
}
