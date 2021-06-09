package hw4;

/**
 * this class for player
 * @author mohamed
 */

public class Playground_Owner {
    protected String name;
    protected String email;
    protected String defaultlocation;
    protected long phone;
    protected int password;
    
    /**
     * this a default constructor
     */

    public Playground_Owner() {}
    
    /**
     * this is a parameterize constructor
     * @param name
     * @param email
     * @param defaultlocation
     * @param phone
     * @param password 
     */

    public Playground_Owner(String name, String email, String defaultlocation, long phone, int password) {
        this.name = name;
        this.email = email;
        this.defaultlocation = defaultlocation;
        this.phone = phone;
        this.password = password;
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
     * this function to set default location
     * @param defaultlocation 
     */

    public void setDefaultlocation(String defaultlocation) {
        this.defaultlocation = defaultlocation;
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
     * this function to get default location
     * @return default location
     */

    public String getDefaultlocation() {
        return defaultlocation;
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
