/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
/**
 *
 * @author brettdeetz
 */

public class Morgue  {
   
//Sets the room description and title for the rooms
    private String roomDescription = "You enter a room that appears to be a morgue.You are immediadtley disgusted by the smells present. You see the following in the room: stack of bodies, a small,mutated rodent-thing, and a body bag.";
    private String roomTitle = "The Morgue";

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
    public Morgue(){this.Queue = new LinkedList<>();
}
    
    //Constructor with Parameters
    public Morgue(String roomDescription, String roomTitle){
        this.Queue = new LinkedList<>();
        setRoomDescription(roomDescription);
        setRoomTitle(roomTitle);
    }
    
    Queue<String> Queue;
Queue<Integer> myNumbers = new LinkedList<>();
Stack<String> stack = new Stack<String>(); 




}
