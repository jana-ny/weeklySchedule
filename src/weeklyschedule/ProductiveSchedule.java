            /**Jana alyamani and Sarah almalki's project*/ 

public class ProductiveSchedule {
    /*The course attribute holds the event name.*/    
    private String eventName ;
    /*The day attribute holds the day of the event.*/    
    public String day;
    /*This attribute holds the type of the event: seminar, workshop.*/
    private int eventType ;
    
    /**
     * Constructor 
     * @param eventName the eventName in the ProductiveSchedule.
     * @param day the day of the event in the ProductiveSchedule. 
     * @param eventType the eventType of the ProductiveSchedule.
     */
    public ProductiveSchedule(String eventName, String day, int eventType) {
        this.eventName = eventName;
        this.day = day;
        this.eventType = eventType;
    }
    /**
     * 
     * @return The value in the eventName field. 
     */
    public String getEventName() {
        return eventName;
    }
    /**
     * 
     * @return The value in the day field.
     */
    public String getDay() {
        return day;
    }
    /**
     * 
     * @return The value in the EventType field.
     */
    public int getEventType() {
        return eventType;
    }
    /**
     * The setEventName method stores a value in the 
     * eventName field.
     * @param eventName the value to store in eventName.
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    /**
     * The setDay method stores a value in the 
     * day field. 
     * @param day the value to store in day. 
     */
    public void setDay(String day) {
        this.day = day;
    }
    /**
     * The setEventType method stores a value in the 
     * eventType field.
     * @param eventType the value to store in eventType.
     */
    public void setEventType(int eventType) {
        this.eventType = eventType;
    }
    /**
     * toString method
     * @return A string containing the ProductiveSchedule object's  information.  
     */
    @Override
    public String toString() {
        return  "eventName:" + eventName
                + "\nday" + day 
                + "\neventType" + eventType ;
    }
    
    
}
