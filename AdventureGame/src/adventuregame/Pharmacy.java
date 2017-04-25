package adventuregame;

/**
 *
 * @author Nick
 */
public class Pharmacy implements IRoom {

    private String roomDescription;
    private String roomTitle;
    
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
    
}
