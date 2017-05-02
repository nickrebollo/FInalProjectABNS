/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @authors Arne, Sam, Nick, Brett
 */
public class Main {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        basicRoom FirstRoom = new basicRoom("First Room", "In this room, there is a broken cupboard hanging off the wall, an old shoebox in the corner, and a door on the left wall. Try to get out");
        Hallway Hallway = new Hallway("Hallway", "You exit the room to find yourself in a long hallway. To your right is a storage closet, a dirty custodial cart in front of you, and a dark hallway to your left.");
        
        Room ThirdRoom = new Room("Third Room", "This is the description of the first room. Try to get out");
        Pharmacy Pharmacy = new Pharmacy("Pharmacy", "This room is dimily lit. The barred windows let in streams of light. " + 
                " There are medicine cabinets everywhere you look.");
        //operatingRoom ORoom = new operatingRoom ("Operating Room", "As soon as you enter, there's a putrid smell of "+
                //"blood and the area looks ransacked.");
        
        //Initialize arraylist for Inventory
        ArrayList<String> inventory = new ArrayList<>();
        
        Stack lifo = new Stack();

        
        //Initialize Scanner
        Scanner in = new Scanner(System.in);
        
        //Run Program
        
        //First Room
        int condition1 = 0;
        
        while(condition1 != 1) {
        System.out.println("You find yourself in the First Room");
        System.out.println(FirstRoom.getRoomDescription());
        System.out.println(FirstRoom.getRoomTitle());
        System.out.println("Choose a menu item: ");
        System.out.println("1: Open Door");
        System.out.println("2: Look in cupboard");
        System.out.println("3: Open shoebox");
        System.out.println("4: View inventory");
        
        int menuItem = Integer.parseInt(in.nextLine());
        switch(menuItem) {
            case 1:
                if(inventory.contains("First Room Key")){
                    System.out.println("The door has opened");
                    condition1 = 1;
                    
                }
                else{
                    System.out.println("The door is locked, it appears to need a key");
                }
                break;
            
                
            case 2:
                System.out.println("There is nothing in the cupboard");
                break;
                
                
            case 3:
                System.out.println("The shoebox contains a key and a pencil");
                System.out.println("Choose a menu item: ");
                System.out.println("1: Take key");
                System.out.println("2: Take pencil");
                System.out.println("3: Back to room options");
                  
                    int menuItemShoebox1 = Integer.parseInt(in.nextLine());
                    switch(menuItemShoebox1) {
                        case 1:
                            System.out.println("You have added the key to your inventory");
                            inventory.add("First Room Key");
                            break;
                        
                            
                        case 2:
                            System.out.println("You have added the pencil ");
                            inventory.add("Pencil");
                            break;
                           
                        case 3:
                            break;
                    }
            break;
            
            case 4:
                if(inventory.size() > 0){
                    Inventory.getList(inventory);    
                }
                else{
                    System.out.println("There is nothing in your inventory");
                }
            break;    
        }
      
    }
    System.out.println("You have escaped the First Room");
	//First Hallway
    int condition2 = 0;
    int hallwayCondition = 0;
        
    while(condition2 != 1){
        while(hallwayCondition != 1){
        System.out.println("You find yourself in a hallway");
        System.out.println(Hallway.getRoomDescription());
        System.out.println(Hallway.getRoomTitle());
        System.out.println("Choose a menu item: ");
        System.out.println("1: Open Storage Closet");
        System.out.println("2: Search Custodial Cart");
        System.out.println("3: Continue down hallway");
        System.out.println("4: View inventory");
        
        
        int menuItem = Integer.parseInt(in.nextLine());
        switch(menuItem) {
            case 1:
                System.out.println("The storage closet, except for some garbage on the ground.");
                System.out.println("1: Pick up garbage");
                System.out.println("2: Go back to hallway");
                    int menuItemStorageCloset = Integer.parseInt(in.nextLine());
                    switch(menuItemStorageCloset){
                        case 1:
                            System.out.println("You pick up the garbage, and find a piece of paper with a 6 digit code written on a crumpled piece of paper. You add it to your inventory");
                            inventory.add("Paper with code(424262)");
                            break;
                        case 2:
                            break;
                    }
            
                
            case 2:
                System.out.println("The cart contains a bunch of dirty rags");
                System.out.println("1: Take dirty rags");
                System.out.println("2: Go back to hallway");
                
                    int menuItemCart = Integer.parseInt(in.nextLine());
                    switch(menuItemCart){
                        case 1:
                            inventory.add("Dirty rags");
                            System.out.println("You added the dirty rags to your inventory, for some reason");
                            break;
                        case 2:
                            break;
                    }
           
            case 3:
                hallwayCondition = 1;
                break;
                    
            case 4:
                if(inventory.size() > 0){
                Inventory.getList(inventory);    
                }
                else{
                    System.out.println("There is nothing in your inventory");
                }
                break;
        }
        
        }
        
        if(hallwayCondition ==1){
            while(hallwayCondition == 1){
            System.out.println("You continue further down the hallway.  You see a door with a keypad entry, a trashcan, and a large slab of concrete on the ground");
                System.out.println("Choose a menu item: ");
                System.out.println("1: Open Door");
                System.out.println("2: Search trashcan");
                System.out.println("3: Take concrete");
                System.out.println("4: Go back the way you came");
                System.out.println("5: View Inventory");
                  
                    int menuItemDownHallway = Integer.parseInt(in.nextLine());
                    switch(menuItemDownHallway) {
                        case 1:
                            if(inventory.contains("Paper with code(424262)")){
                            System.out.println("The door has opened");
                            hallwayCondition = 0;
                            condition2 = 1;
                            }
                            else{
                            System.out.println("The door is locked, it appears to require a secret code");
                            }
                            break;   
                        case 2:
                            System.out.println("The trashcan is empty");
                            break;
                        case 3:
                            inventory.add("Slab of concrete");
                            System.out.println("You added the slab of concrete to your inventory");
                            break;
                        case 4:
                            condition2 = 0;
                            hallwayCondition = 0;
                            break;
                        case 5:
                            if(inventory.size() > 0){
                            Inventory.getList(inventory);    
                            }
                            else{
                            System.out.println("There is nothing in your inventory");
                            }
                            break;
                        }
        }
    }
    }
	//Pharmacy
    int condition3 = 0;
    
    while(condition2 != 1){
    System.out.println("You enter the " + Pharmacy.getRoomTitle());
    System.out.println(Pharmacy.getRoomDescription());
    System.out.println("1: Scream for help");
    System.out.println("2: Look through the cabinets");
    System.out.println("3: Examine the door");
    System.out.println("4: View Inventory");
    
    int menuItem = Integer.parseInt(in.nextLine());
    switch (menuItem){
        case 1: 
            System.out.println("You hear your echo... then silence...");
            break;
            
        case 2:
            System.out.println("There are three cabinets nearby. WHich one do you open?");
            System.out.println("1: Trash");
            System.out.println("2: Reciepts");
            System.out.println("3: Supplies");            
            int menuItemCabinets = Integer.parseInt(in.nextLine());
                    switch(menuItemCabinets) {
                        case 1: 
                            System.out.println("An employee threw away what seems to be a key card.");
                            System.out.println("You keep the card.");
                            inventory.add("Key Card");
                            break;
                            
                        case 2:
                            System.out.println("Just as you suspected. Receipts.");
                            break;
                            
                        case 3:
                            System.out.println("Mops and brooms. Not much else.");
                            break;
                    }
                    break;
                    
        case 3:
            if (inventory.contains("Key Card")){
                System.out.println("You wave the card you picked up at the door. It opens.");
                condition2 = 1;
            }else{
                System.out.println("There's a handle but the door won't budge.");
                System.out.println("Maybe there's a key somewhere...");
            }
            break;
            
        case 4:
                if(inventory.size() > 0){
                    Inventory.getList(inventory);    
                }
                else{
                    System.out.println("There is nothing in your inventory");
                }
            break;    
    }
    }
    System.out.println("You leave the Pharmacy.");
    }
}