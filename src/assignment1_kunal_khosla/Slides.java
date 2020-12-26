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
public class Slides {
    private String[] slidesName;
    private double slidesAmount;
    public Slides(String slidesName,double slidesAmount)
    {
        this.slidesName=slidesName.split(":");
        this.slidesAmount=slidesAmount;
    }
    public double getSlideAmount()
    {
        return this.slidesAmount;
    }
    public String[] getSlidesName()
    {
        return this.slidesName;
    }
    @Override
    public String toString()
    {
        String slidesS="\nSlides                   $"+this.getSlideAmount();
          for(int i=0;i<slidesName.length;i++)
          {
              slidesS+="\n>"+slidesName[i];
          }
          return slidesS;
    }
}
