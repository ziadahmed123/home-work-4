package hw4;

public class HW4 {

    
    public static void main(String[] args) {
        E_Wallet ewallet=new E_Wallet(300);
       Booking_System bs1=new Booking_System();
      Playground_Registration pr1=new Playground_Registration();
        Playground_Registration pr2=new Playground_Registration();
       Player p1=new Player();
      Log_In log1=new Log_In(p1);
       System.out.println();
        Playground_Owner pgo=new Playground_Owner();
       Log_In log2=new Log_In(pgo);
      System.out.println();
       Administrator admin1=new Administrator();
       Log_In log3=new Log_In(admin1);
      Player p2=new Player(pr1);
       System.out.println();
     Administrator admin2=new Administrator(pr2);
       System.out.println();
      Player p3=new Player(bs1);
     System.out.println(ewallet.getAmount());
       System.out.println (ewallet.Pay(550));
      System.out.println (ewallet.Collect(80, 70));
        


    }
    
}
