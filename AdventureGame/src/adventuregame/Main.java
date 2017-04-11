/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.ArrayList;
import java.util.Scanner;

//TEST 4/6/2017 1:15

/**
 *
 * @author Arne
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Room FirstRoom = new Room("First Room", "In this room, there is a broken cupboard hanging off the wall, an old shoebox in the corner, and a door on the left wall. Try to get out");
        Room SecondRoom = new Room("Second Room", "This is the description of the first room. Try to get out");
        Room ThirdRoom = new Room("Third Room", "This is the description of the first room. Try to get out");
        
        ArrayList<String> inventory = new ArrayList<>();
        
        int condition1 = 0;
        
        while(condition1 != 1) {
        System.out.println("You find yourself in the First Room");
        System.out.println(FirstRoom.getDescription());
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
                Inventory.getList(inventory);
            break;    
        }
      
    }
    System.out.println("You have escaped the First Room");
    
}
}