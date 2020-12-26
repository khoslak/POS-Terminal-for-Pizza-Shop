/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_kunal_khosla;

/**
 *
 * @author Kunal
 */
public class Drink {
    private String[] bever;
    private double amount=0;
    public Drink(String nameBever,double amount)
    {
        bever=nameBever.split(":");
         this.amount=amount;
        
    }
    public double getDrinksAmount()
    {
        return this.amount;
    }
    public String[] getDrinksName()
    {
        return this.bever;
    }
    @Override
    public String toString()
    {
        String begv="\nBEVERAGES                  $"+this.getDrinksAmount();
          for(int i=0;i<bever.length;i++)
          {
              begv+="\n>"+bever[i];
          }
          return begv;
    }
    
    
}
