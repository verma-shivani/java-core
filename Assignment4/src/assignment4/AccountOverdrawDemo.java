
package assignment4;


import java.util.logging.Level;
import java.util.logging.Logger;



class MyThreadNotSafe extends Thread{

 Account obj;

    public MyThreadNotSafe(Account obj) {
        this.obj = obj;
    }
 
    public void run() {
       Thread t= Thread.currentThread();
       String tname=t.getName();
        System.out.println(tname+" is withdrawing......");
     try {
         Thread.sleep(3000);
     } catch (InterruptedException ex) {
         System.out.println(ex.getMessage());   
     }
     obj.withdraw(20000);//To change body of generated methods, choose Tools | Templates.
    }
    
}
public class AccountOverdrawDemo {

    
    public static void main(String[] args) {
        Account accountObj=new Account();
        MyThreadNotSafe t1=new MyThreadNotSafe(accountObj);
        t1.setName("AccountHolder1");
        MyThreadNotSafe t2=new MyThreadNotSafe(accountObj);
        t2.setName("AccountHolder2");
        t1.start();
        
        t2.start();
        
        
    }
    
}
