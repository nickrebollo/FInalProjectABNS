/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;
//Hi
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @authors Arne, Sam, Nick, Brett
 * Test
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        basicRoom FirstRoom = new basicRoom("First Room", "In this room, there is a broken cupboard hanging off the wall, an old shoebox in the corner, and a door on the left wall. Try to get out");
        Hallway Hallway = new Hallway("Hallway", "You exit the room to find yourself in a long hallway. To your right is a storage closet, a dirty custodial cart in front of you, and a dark hallway to your left.");
        
        Room ThirdRoom = new Room("Third Room", "This is the description of the first room. Try to get out");
        Pharmacy Pharmacy = new Pharmacy("Pharmacy", "You enter a dimily lit room. The barred windows let in streams of light. " + 
                " There are medicine cabinets everywhere, but your mind is focused on leaving instead of gathering materials.");
        operatingRoom ORoom = new operatingRoom ("Operating Room", "As soon as you enter, there's a putrid smell of "+
                "blood and the area looks ransacked.");
        
        //Initialize arraylist for Inventory
        ArrayList<String> inventory = new ArrayList<>();
        
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
        
    if(hallwayCondition == 0){
        while(condition1 != 1) {
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
                System.out.println("Go back to hallway");
                    int menuItemStorageCloset = Integer.parseInt(in.nextLine());
                    switch(menuItemStorageCloset){
                        case 1:
                            System.out.println("You pick up the garbage, and find a piece of paper with a 6 digit code written on a crumpled piece of paper. You add it to your inventory");
                            inventory.add("Paper with code(424262)");
                            break;
                        case 2:
                            break;
                    }
                break;
            
                
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
        }
        
        else{
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
                
        }
    

