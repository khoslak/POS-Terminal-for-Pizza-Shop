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
public class Combo {
    private String cName="";
    private double cAmount=0;
    public Combo(String comboName,double comboAmount)
    {
        this.cName=comboName;
        this.cAmount=comboAmount;
    }
    public double getComboAmount()
    {
        return this.cAmount;
    }
    @Override
    public String toString()
    {
        return "#"+this.cName+"         $"+this.getComboAmount();
    }
    
}
