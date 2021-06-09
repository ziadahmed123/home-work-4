package hw4;

/**
 * this class for Playground Registration
 * @author mohamed
 */

public class Playground_Registration {
 private String PName;
 private String location;
 private float size;
 private int available_Hour;
 private float price_Of_hour ;
 private String cancelation_Perioud;
 private String playground_Status;
 
 /**
  *  this a default constructor
  */

    public Playground_Registration() {}
    
    /**
     * this is a parameterize constructor
     * @param PName
     * @param location
     * @param size
     * @param available_Hour
     * @param price_Of_hour
     * @param cancelation_Perioud
     * @param playground_Status 
     */

    public Playground_Registration(String PName, String location, float size, int available_Hour, float price_Of_hour, String cancelation_Perioud, String playground_Status) {
        this.PName = PName;
        this.location = location;
        this.size = size;
        this.available_Hour = available_Hour;
        this.price_Of_hour = price_Of_hour;
        this.cancelation_Perioud = cancelation_Perioud;
        this.playground_Status = playground_Status;
        
    }
    
    /**
     * this function to get name
     * @return name
     */

    public String getPName() {
         System.out.println("the name of playground is:");
        return PName;
    }
    
    /**
     * this function to set name
     * @param PName 
     */

    public void setPName(String PName) {
        this.PName = PName;
    }
    
    /**
     * this function to get location
     * @return 
     */

    public String getLocation() {
         System.out.println("the location of playground is:");
        return location;
    }
    
    /**
     * this function to set location
     * @param location 
     */

    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * this function to get size
     * @return 
     */

    public float getSize() {
         System.out.println("the size of playground is:");
        return size;
    }
    
    /**
     * this function to set size
     * @param size 
     */

    public void setSize(float size) {
        this.size = size;
    }
    
    /**
     * this function to get available hour
     * @return available hour
     */

    public int getAvailable_Hour() {
         System.out.println("the avaliable hours are:");
        return available_Hour;
    }
    
    /**
     * this function to set available hour
     * @param available_Hour 
     */

    public void setAvailable_Hour(int available_Hour) {
        this.available_Hour = available_Hour;
    }
    
    /**
     * this function to get price of hour
     * @return price of hour
     */

    public float getPrice_Of_hour() {
        System.out.println("price per hour is:" );
        return price_Of_hour;
    }
    
    /**
     * this function to set price of hour
     * @param price_Of_hour 
     */

    public void setPrice_Of_hour(float price_Of_hour) {
        this.price_Of_hour = price_Of_hour;
    }
    
    /**
     * this function to get cancel period
     * @return  cancel period
     */

    public String getCancelation_Perioud() {
        System.out.println("you can cancel your booking in 30min after booking it");
        return cancelation_Perioud;
    }
    
    /**
     *   this function to set canceltion period
     * @param cancelation_Perioud 
     */

    public void setCancelation_Perioud(String cancelation_Perioud) {
        this.cancelation_Perioud = cancelation_Perioud;
    }
    
    /**
     * this function to get playground status
     * @return playground status
     */

    public String getPlayground_Status() {
        System.out.println("this playground is:");
        return playground_Status;
    }
    
    /**
     * this function to set playground status
     * @param playground_Status 
     */

    public void setPlayground_Status(String playground_Status) {
        this.playground_Status = playground_Status;
    }  
}
