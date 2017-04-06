/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.Vector;
import javax.rmi.CORBA.Util;

/**
 *
 * @author Arne
 */
public class Room {
    
      //Sets up the variables for room names, descriptions and exits
   private String m_RoomTitle;
   private String m_RoomDescription;
   private Vector m_vecExit;

   //Blank Constructors
   public Room()
   {
       m_RoomTitle = new String();
       m_RoomDescription = new String();
       m_vecExit = new Vector();
   }

   //Constructors with full info
   public Room (String Title, String Description)
   {
       m_RoomTitle = Title;
       m_RoomDescription = Description;
       m_vecExit = new Vector();
   }

   //Collects the room title
   public String toString()
   {return m_RoomTitle;}


   public void setTitle (String RoomTitle)
   {m_RoomTitle = RoomTitle;}

   public String getTitle()
   {return m_RoomTitle;}

   public String getDescription()
   {return m_RoomDescription;}

   public void setDescription(String roomDescription)
   {m_RoomDescription = roomDescription;}
}


