package adventuregame;

/**
 *
 * @author Nick
 */
public class operatingRoom implements IRoom {
    
    private String roomDescription;
    private String roomTitle;
    
    public operatingRoom (String roomTitle, String roomDescription){
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
    
}
