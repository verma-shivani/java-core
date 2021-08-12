
package assignment4;


import java.util.logging.Level;
import java.util.logging.Logger;



class MyThread extends Thread{

 Account obj;

    public MyThread(Account obj) {
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
     obj.withdraw(1000);//To change body of generated methods, choose Tools | Templates.
    }
    
}
public class Assignment4 {

    
    public static void main(String[] args) {
        Account accountObj=new Account();
        MyThread t1=new MyThread(accountObj);
        t1.setName("accountHolder1");
        MyThread t2=new MyThread(accountObj);
        t2.setName("accountHolder2");
        t2.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        
        t2.start();
        
        
    }
    
}
