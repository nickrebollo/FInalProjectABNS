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
    public basicRoom(){}
    
    //Constructor with Parameters
    public basicRoom(String roomDescription, String roomTitle){
        setRoomDescription(roomDescription);
        setRoomTitle(roomTitle);
    }
    
    @Override
    public void northSide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eastSide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void southSide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void westSide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}