package hw4;

/**
 *this class for administrator
 * @author dell
 */

public class Administrator {
    protected String name;
    protected String email;
    protected Playground_Registration r;
    
    /**
     * this a default constructor
     */

    public Administrator() {}

    public Administrator(Playground_Registration r) {
        this.r = r;
        System.out.println("display all data about the play ground");
         r.setPName("barca");
        System.out.println(r.getPName());
        r.setLocation("naser city");
        System.out.println(r.getLocation());
        System.out.println("because of complmintes in this playground, the play ground deleted from the system");
        
    }
    
    
    
    /**
     * this is a parameterize constructor
     * @param name
     * @param email 
     */

    public Administrator(String name, String email) {
        this.name = name;
        this.email = email;
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
     * this function to get name
     * @return 
     */

    public String getName() {
        return name;
    }
    
    /**
     * this function to get email
     * @return 
     */

    public String getEmail() {
        return email;
    }
     public boolean cancel_booking(){return true;}
}
