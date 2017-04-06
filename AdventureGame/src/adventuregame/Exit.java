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
public class Exit {

   //Placing values on the directions
   public static final int Undefined = 0;
   public static final int North = 1;
   public static final int South = 2;
   public static final int East = 3;
   public static final int West = 4;
   public static final int Up = 5;
   public static final int Down = 6;
   public static final int In = 7;
   public static final int Out = 8;


   //States the names for the directions of the player
   public static final String[] dirName = {
           "Undefined", "North", "South", "East", "West", "Up", "Down", "In", "Out"
   };

   //Shortened version of the directions
   public static final String[] shortDirName = {
           "Null", "N", "S", "E", "W", "U","D","I", "O"
   };

   //Sets up variables
   private Room m_leadsTo = null;
   private int m_direction;

   //Full name of direction
   private String m_fullDirectionName;

   //Shortened direction Names
   private String m_shortDirectionName;

   //Default constructors
   public Exit()
   {
       m_direction = Exit.Undefined;
       m_leadsTo = null;
       m_fullDirectionName = dirName[Undefined];
       m_shortDirectionName = dirName[Undefined];
   }

}


