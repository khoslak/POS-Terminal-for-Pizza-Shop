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
public class Pizza {
    private String size;
    private double sizePrice;
    private String crust;
    private double crustPrice;
    private String[] topping;
    private double toppingPrice;
    
    Pizza(String size,double sizePrice,String crust,double crustPrice,String topping,double toppingPrice)
    {
        this.size=size;
        this.crust=crust;
        this.sizePrice=sizePrice;
        this.crustPrice=crustPrice;
        this.topping=topping.split(":");
        this.toppingPrice=toppingPrice;
        
    }
    public String getSize()
    {
        return this.size;
    }
    public String getCrust()
    {
        return this.crust;
    }
    public int getToppingLength()
    {
        return topping.length;
    }
    public String[] getTopping()
    {
        return topping;
    }
    public double getSizePrice()
    {
        return this.sizePrice;
    }
    public double getCrustPrice()
    {
        return this.crustPrice;
    }
    public double getToppingPrice()
    {
        return this.toppingPrice;
    }
    public double getSubTotal()
    {
        return this.getSizePrice()+this.getCrustPrice()+this.getToppingPrice();
    }
    
    public String toString()
    {
        String receipt="\n"+this.getSize()+"       $"+this.getSubTotal()+"\n****"+this.getCrust()+"\nTOPPINGS"+"\n";
        for(String e:topping)
        {
            receipt+=">"+e+"\n";
        }
          
        return receipt;
    }
    
}
