package hw4;

/**
 * this class for login
 * @author mohamed
 */

public class Log_In {
    protected Player P;
    protected Playground_Owner PGO;
    protected Administrator admin;

    /**
     * this a default constructor
     */
    
    public Log_In() { }
    
    /**
     * this is a parameterize constructor
     * @param P 
     */
    public Log_In(Player P) {
        this.P = P;
         Player p1=new Player();
        System.out.println(" enter player data");
        p1.setName("ahmed");
        p1.setAddress("alex");
        p1.setEmail("google");
        p1.setPhone(456654456);
        p1.setPassword(0x111);
       System.out.println("player name is:" + p1.getName());
        System.out.println("player address is:" +p1.getAddress());
        System.out.println("player email is:" +p1.getEmail());
        System.out.println("player phone is:" +p1.getPhone());
        System.out.println("player password is:" +p1.getPassword());
        
       
    }
    
    /**
     * this is a parameterize constructor
     * @param PGO 
     */

    public Log_In(Playground_Owner PGO) {
        this.PGO = PGO;
         Playground_Owner pgo=new Playground_Owner();
        System.out.println(" enter playground owner data");
        pgo.setName("mohamed");
        pgo.setDefaultlocation("cairo");
        pgo.setEmail("facbook");
        pgo.setPhone(1251225412);
        pgo.setPassword(0x4d3);
       System.out.println("playground owner name is:" + pgo.getName());
        System.out.println("playground owner address is:" +pgo.getDefaultlocation());
        System.out.println("playground owner email is:" +pgo.getEmail());
        System.out.println("playground owner phone is:" +pgo.getPhone());
        System.out.println("playground owner password is:" +pgo.getPassword());
    }
    
    /**
     * this is a parameterize constructor
     * @param admin 
     */

    public Log_In(Administrator admin) {
        this.admin = admin;
         Administrator admin1=new Administrator();
        System.out.println(" enter dministrator data");
        admin1.setName("mohsen");
        admin1.setEmail("instgram");
       System.out.println("administrator name is:" + admin1.getName());
        System.out.println("administrator email is:" +admin1.getEmail());
  
    }
    
    /**
     * this function to set player
     * @param P 
     */
    
    public void setP(Player P) {
        this.P = P;
    }
    
    /**
     * this function to get player
     * @return player
     */

    public Player getP() {
        return P;
    }
    
    /**
     * this function to set playground owner
     * @param PGO 
     */

    public void setPGO(Playground_Owner PGO) {
        this.PGO = PGO;
    }
    
    /**
     * this function to set administrator
     * @param admin 
     */

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }
    
    /**
     * this function to get playground owner
     * @return playground owner
     */

    public Playground_Owner getPGO() {
        return PGO;
    }
    
    /**
     * this function to get administrator
     * @return administrator
     */

    public Administrator getAdmin() {
        return admin;
    }     
}
