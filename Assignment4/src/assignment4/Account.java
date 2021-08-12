/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

public class Account {
    
    static int balance=1000;
   synchronized void withdraw(int amount){
       if(amount<=balance){
           System.out.println("Take cash Rs."+amount);
           balance=balance-amount;
           System.out.println("Available balance is Rs."+balance);
       }
       else{
           System.out.println("insufficient funds");
       }
   }
    
}
