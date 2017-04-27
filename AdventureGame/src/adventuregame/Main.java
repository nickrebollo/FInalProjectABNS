/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;
import java.util.ArrayList;
import java.util.Scanner;
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
        Hallway Hallway = new Hallway("Hallway", "You exit the room to find yourself in a long hallway. To your right is a storage closet, ");
        Room ThirdRoom = new Room("Third Room", "This is the description of the first room. Try to get out");
        Pharmacy Pharmacy = new Pharmacy("Pharmacy", "This room is dimily lit. The barred windows let in streams of light. " + 
                " There are medicine cabinets everywhere you look.");
        operatingRoom ORoom = new operatingRoom ("Operating Room", "As soon as you enter, there's a putrid smell of "+
                "blood and the area looks ransacked.");
        
        ArrayList<String> inventory = new ArrayList<>();
        
        int condition1 = 0;
        
        while(condition1 != 1) {
        System.out.println("You find yourself in the First Room");
        System.out.println(FirstRoom.getRoomDescription());
        System.out.println("Choose a menu item: ");
        System.out.println("1: Open Door");
        System.out.println("2: Look in cupboard");
        System.out.println("3: Open shoebox");
        System.out.println("4: View inventory");
        
        Scanner in = new Scanner(System.in);
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
    
    int condition2 = 0;
    
    while(condition2 != 1){
    System.out.println("You enter the " + Pharmacy.getRoomTitle());
    System.out.println(Pharmacy.getRoomDescription());
    System.out.println("1: Scream for help");
    System.out.println("2: Look through the cabinets");
    System.out.println("3: Examine the door");
    System.out.println("4: View Inventory");
    
    Scanner in = new Scanner(System.in);
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
                            System.out.println("Just as you suspected. Reciepts.");
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