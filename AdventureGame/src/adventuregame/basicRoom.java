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
public class basicRoom implements IRoom {
    
    //Sets the room description and title for the rooms
    private String roomDescription = " ";
    private String roomTitle = " ";
    
    //Empty Contructor
    public basicRoom(){}
    
    //Constructor with Parameters
    public basicRoom(String roomDescription, String roomTitle){
        setRoomDescription(roomDescription);
        setRoomTitle(roomTitle);
    }
    //Getters and Setters for the Description and Title
    public String getRoomDescription() 
    {return roomDescription;}

    public void setRoomDescription(String roomDescription)
    {this.roomDescription = roomDescription;}

    public String getRoomTitle() 
    {return roomTitle;}

    public void setRoomTitle(String roomTitle) 
    {this.roomTitle = roomTitle;}
    
}