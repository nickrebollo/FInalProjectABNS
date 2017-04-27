package adventuregame;

/**
 *
 * @author Nick
 */
public class Pharmacy implements IRoom {

    private String roomDescription;
    private String roomTitle;
    
    public Pharmacy(String roomTitle, String roomDescription){
        setRoomDescription(roomDescription);
        setRoomTitle(roomTitle);
    }
    
    @Override
    public String getRoomDescription() 
    { return roomDescription; }

    @Override
    public void setRoomDescription(String roomDescription)
    { this.roomDescription = roomDescription; }

    @Override
    public String getRoomTitle() 
    { return roomTitle; }

    @Override
    public void setRoomTitle(String roomTitle) 
    { this.roomTitle = roomTitle; }
    
    //Search function 
    public void cabinets() {
        String word = "Supplies";
        String text1 = "Receipt Paper";
        String text2 = "Trash Bags";
        String text3 = "Employee Supplies";
        Boolean found;
        
        if (text1.contains(word)){
            
        }
        
    }
    
}
