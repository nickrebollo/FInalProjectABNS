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
    
   //Sets up the variables for room names, descriptions and exits
   private String RoomTitle;
   private String RoomDescription;

    public String getRoomTitle() 
    {return RoomTitle;}

    public void setRoomTitle(String RoomTitle) 
    {this.RoomTitle = RoomTitle;}

    public String getRoomDescription() 
    {return RoomDescription;}

    public void setRoomDescription(String RoomDescription) 
    {this.RoomDescription = RoomDescription;}

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
