package hw4;

/**
 * this class for player
 * @author mohamed
 */

public class Player {
    protected String name;
    protected String email;
    protected String address;
    protected long phone;
    protected int password;
    protected Playground_Registration pgr;
    protected Booking_System bs;
    
    /**
     * this a default constructor
     */

    public Player() {}
    
    /**
     * this a constructor for Booking_System 
     * @param bs 
     */

    public Player(Booking_System bs) {
        this.bs = bs;
        System.out.println("how many avaliabl playgrounds:");
        bs.setAvailable_playgrounds(3);
        bs.search_for_available_playgrounds(3);
        System.out.println(bs.getAvailable_playgrounds());
        
        
    }
    
    
    
    /**
     *  this a constructor for playground registration
     * @param pgr 
     */

    public Player(Playground_Registration pgr) {
        this.pgr = pgr;
          pgr.setPName("barca");
        System.out.println(pgr.getPName());
        pgr.setLocation("naser city");
        System.out.println(pgr.getLocation());
        pgr.setSize(5);
        System.out.println(pgr.getSize());
        pgr.setAvailable_Hour(3);
        System.out.println(pgr.getAvailable_Hour());
        pgr.setPrice_Of_hour(120);
        System.out.println(pgr.getPrice_Of_hour());
        pgr.setPlayground_Status("available");
        System.out.println(pgr.getPlayground_Status());
        pgr.setCancelation_Perioud("");
        System.out.println(pgr.getCancelation_Perioud());
        System.out.println("i want to book this play ground");

    }
    
    
    /**
     * this is a parameterize constructor
     * @param name
     * @param email
     * @param address
     * @param phone
     * @param password
     * @param pgr 
     */

    public Player(String name, String email, String address, long phone, int password, Playground_Registration pgr) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.pgr = pgr;
    }
    
    /**
     * this function to set name
     * @param name 
     */
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * this function to set email
     * @param email 
     */

    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * this function to set address
     * @param address 
     */

    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * this function to set phone
     * @param phone 
     */

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    /**
     * this function to set password
     * @param password 
     */

    public void setPassword(int password) {
        this.password = password;
    }
  
    /**
     * this function to get name
     * @return name
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * this function to get email
     * @return email
     */

    public String getEmail() {
        return email;
    }
    
    /**
     * this function to get address
     * @return address
     */

    public String getAddress() {
        return address;
    }
    
    /**
     * this function to get phone
     * @return phone
     */

    public long getPhone() {
        return phone;
    }
    
    /**
     * this function to get password
     * @return password
     */

    public int getPassword() {
        return password;
    }
}
