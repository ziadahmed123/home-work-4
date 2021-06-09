package hw4;

/**
 * this class for booking system
 * @author mohamed
 */

public class Booking_System {
    protected int available_playgrounds;
    
    /**
     * this function to get available Hour
     * @return available Hour
     */

    public int getAvailable_playgrounds() {
        return available_playgrounds;
    }
    
    /**
     * this function to set available Hour
     * @param available_Hour 
     */

    public void setAvailable_playgrounds(int available_Hour) {
        this.available_playgrounds = available_Hour;
    }
    
    /**
     * this is a parameterize constructor
     * @param available_playgrounds
     */

    public Booking_System(int available_playgrounds) {
        
        this.available_playgrounds = available_playgrounds;
        Booking_System bs1=new Booking_System();
//        System.out.println("how many avaliabl playground:");
//       System.out.println( bs1.search_for_available_playgrounds(3));

    }
    
    /**
     * this a default constructor
     */

    public Booking_System() {
    }
    
    /**
     * this function to 
     * @param a_grounds search_for_available_playgrounds
     * @return 
     */
    public int search_for_available_playgrounds(int a_grounds){
        return a_grounds;
}  
}
