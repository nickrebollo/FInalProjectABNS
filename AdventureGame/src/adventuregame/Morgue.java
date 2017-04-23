/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author brettdeetz
 */
public class Morgue {
   
//Sets the room description and title for the rooms
    private String roomDescription = " ";
    private String roomTitle = " ";

    //Getters and Setters for the Description and Title
    public String getRoomDescription() 
    {return roomDescription;}

    public void setRoomDescription(String roomDescription)
    {this.roomDescription = roomDescription;}

    public String getRoomTitle() 
    {return roomTitle;}

    public void setRoomTitle(String roomTitle) 
    {this.roomTitle = roomTitle;}
    
    //Empty Contructor
    public Morgue(){}
    
    //Constructor with Parameters
    public Morgue(String roomDescription, String roomTitle){
        setRoomDescription(roomDescription);
        setRoomTitle(roomTitle);
    }
}