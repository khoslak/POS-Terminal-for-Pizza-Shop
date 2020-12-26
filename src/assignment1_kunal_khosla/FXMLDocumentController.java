/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_kunal_khosla;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kunal
 */
public class FXMLDocumentController implements Initializable {
    ArrayList<Pizza> pizza=new ArrayList<Pizza>();
    ArrayList<Drink> drinks=new ArrayList<Drink>();
    ArrayList<Slides> slides=new ArrayList<Slides>();
    ArrayList<Combo>combos=new ArrayList<Combo>();

    @FXML
    private Label label;
  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private RadioButton small;
    @FXML
    private Button sldBev;
    @FXML
    private Button clear;
    @FXML
    private Button recall;
     @FXML
    private RadioButton medium;
      @FXML
    private RadioButton large;
       @FXML
    private RadioButton xLarge;
       @FXML
       private RadioButton thinCrust;
        @FXML
       private RadioButton handMade;
         @FXML
       private RadioButton stuffCrust;
       @FXML
       private ToggleGroup size;
       @FXML
       private ToggleGroup crust;
       @FXML
       private Button add;
       @FXML
       private Button finish;
       @FXML
       private CheckBox pepperoni;
       @FXML
       private CheckBox bacon;
       @FXML
       private CheckBox sausage;
       @FXML
       private CheckBox ham;
       @FXML
       private CheckBox beef;
       @FXML
       private CheckBox greenPepper;
       @FXML
       private CheckBox greenOlives;
       @FXML
       private CheckBox tomatoes;
       @FXML
       private CheckBox onion;
       @FXML
       private CheckBox mushroom;
       @FXML
       private TextArea Treceipt;
       @FXML
       private StackPane sPane;
            
       @FXML
       public void addTo()
       {
           String size="Small Pizza";
           double sizePrice=5.99;
           if(small.isSelected())
           {
               size="Small Pizza";
               sizePrice=5.99;
               small.setSelected(false);
             
               
               
           }
           if(medium.isSelected())
           {
               size="Medium Pizza";
               sizePrice=8.75;
               medium.setSelected(false);
         
               
           }
           if(large.isSelected())
           {
               size="Large Pizza";
               sizePrice=11.99;
               large.setSelected(false);
             
           }
           if(xLarge.isSelected())
           {
               size="Extra large Pizza";
               sizePrice=14.75;
               xLarge.setSelected(false);
             
           }
           String crust="Crunchy Thin Crust";
           double crustPrice=3.99;
           if(thinCrust.isSelected())
           {
               crust="Crunchy Thin Crust";
               crustPrice=3.99;
               thinCrust.setSelected(false);
              
           }
           if(stuffCrust.isSelected())
           {
               crust="Stuffed Crust";
               crustPrice=2.00;
               stuffCrust.setSelected(false);
              
           }
           if(handMade.isSelected())
           {
               crust="Hand Made";
               crustPrice=3.00;
               handMade.setSelected(false);
              
           }
           
           String topping="";
           Double toppingPrice=0.00;
           if(pepperoni.isSelected())
           {
               topping+="Pepperoni:";
               toppingPrice+=2.00;
               pepperoni.setSelected(false);
            
               
           }
           if(ham.isSelected())
           {
               topping+="Ham:";
               toppingPrice+=2.75;
               ham.setSelected(false);
           
           }
           if(sausage.isSelected())
           {
               topping+="Sausage:";
               toppingPrice+=2.20;
               sausage.setSelected(false);
              
           }
           if(beef.isSelected())
           {
               topping+="Beef:";
               toppingPrice+=3.00;
               beef.setSelected(false);
               
           }
           if(bacon.isSelected())
           {
               topping+="Bacon:";
               toppingPrice+=2.00;
               bacon.setSelected(false);
              
           }
           if(greenOlives.isSelected())
           {
               topping+="Green Olives:";
               toppingPrice+=1.20;
               greenOlives.setSelected(false);
              
           }
           if(greenPepper.isSelected())
           {
               topping+="Green Pepper:";
               toppingPrice+=1.20;
               greenPepper.setSelected(false);
               
           }
           if(tomatoes.isSelected())
           {
               topping+="Tomatoes:";
               toppingPrice+=2.00;
               tomatoes.setSelected(false);
              
           }
           if(onion.isSelected())
           {
            topping+="Onions:";   
            toppingPrice+=1.00;
            onion.setSelected(false);
           
           }
           if(mushroom.isSelected())
           {
               topping+="Mushroom:";
               toppingPrice+=1.00;
               mushroom.setSelected(false);
             
           }
           Pizza pizz=new Pizza(size,sizePrice,crust,crustPrice,topping,toppingPrice);
           pizza.add(pizz);
           
        ;
         
       }
       public void getReciept()
       {
           
           int orderNo=(int)(Math.random()*1000);
            String orderNumber=""+orderNo+"";
        
           double subtotal=0.00;
           double tax=0.00;
           double total=0.00;
           String receipt="";
           Date date=new Date();
           
           for(int i=0;i<pizza.size();i++)
           {
               subtotal+=pizza.get(i).getSubTotal();
           }
            if(drinks.isEmpty()==false)
            {
           subtotal+=slides.get(0).getSlideAmount();
            }
             if(slides.isEmpty()==false)
             {
           subtotal+=drinks.get(0).getDrinksAmount();
             }
             if(combos.isEmpty()==false)
             {
                 subtotal+=combos.get(0).getComboAmount();
             }
           tax=subtotal*0.13;
           total=subtotal+tax;
           receipt+="                               PIZZA BUILDER";
           receipt+="\n                           10036,MANHATTAN,NY             ";
           receipt+="\n                                    USA ";
           receipt+="\n************************************************";
           receipt+="\n"+date.toString();
           receipt+="\nORDER NUMBER :"+orderNo;
           for(Pizza e:pizza)
           {
               receipt+=e.toString();
           }
           if(drinks.isEmpty()==false)
           {
           receipt+=drinks.get(0).toString();
           }
           if(slides.isEmpty()==false)
           {
           receipt+=slides.get(0).toString();
           }
           if(combos.isEmpty()==false)
           {
               receipt+="\n"+combos.get(0).toString();
           }
           receipt+="\n*************************************************";
           receipt+="\nSUBTOTAL              $"+subtotal+"\n TAX                $"+tax+"\n TOTAL               $"+total;
           Treceipt.setText(receipt);
           File file=new File(orderNumber+".txt");
           try
           {
           if(!(file.exists()))
           {
               file.createNewFile();
           }
           FileWriter fw=new FileWriter(file.getAbsoluteFile());
           BufferedWriter bw=new BufferedWriter(fw);
           bw.write("                             PIZZA BUILDER               ");
           bw.newLine();
           bw.write("                           10036,MANHATTAN,NY");
           bw.newLine();
           bw.write("                                   USA");
           bw.newLine();
           bw.write("**************************************************");
           bw.newLine();
           bw.write(date.toString());
           bw.newLine();
           bw.write("ORDER NUMBER :"+orderNumber);
           bw.newLine();
           for(int i=0;i<pizza.size();i++)
           { 
               bw.write(pizza.get(i).getSize()+"                             $"+pizza.get(i).getSubTotal());
               bw.newLine();
               bw.write("***"+pizza.get(i).getCrust());
               bw.newLine();
               String[] topping=pizza.get(i).getTopping();
               for(String s:topping)
               {
                 
                 bw.write(s);
                 bw.newLine();
               }
              
           }
           if(drinks.isEmpty()==false)
           {
               bw.write("Beverages               $"+drinks.get(0).getDrinksAmount());
               bw.newLine();
               for(String e:drinks.get(0).getDrinksName())
               {
                   bw.write(">"+e);
                   bw.newLine();
               }
               bw.newLine();
           }
           
           if(slides.isEmpty()==false)
           {
              bw.write("Slides                 $"+slides.get(0).getSlideAmount());
              bw.newLine();
              for(String e:slides.get(0).getSlidesName())
              {
                  bw.write(">"+e);
                  bw.newLine();
              }
              
           }
           if(combos.isEmpty()==false)
           {
               bw.write(combos.get(0).toString());
               bw.newLine();
           }
           bw.write("**************************************************");
           bw.newLine();
           bw.write("      SUBTOTAL                    $"+subtotal);
           bw.newLine();
           bw.write("      TAXES (13%)                 $"+tax);
           bw.newLine();
           bw.write("      TOTAL                       $"+total);
           bw.close();
           pizza.clear();
           }
           catch(IOException e)
           {
               System.out.println("SORRY RECEIPT CANNOT BE GENERATED");
           }
                 
       }
      
       @FXML
       public void recallOrder()
       {
           Stage st=new Stage();
           Label ord=new Label("ENTER THE ORDER NUMBER");
           TextField tf=new TextField();
           TextArea ta=new TextArea();
           ta.setPrefWidth(350);
           ta.setPrefHeight(250);
           GridPane gp=new GridPane();
           gp.setPadding(new Insets(10,10,10,30));
           gp.add(ord, 0, 0);
           gp.add(tf, 1, 0);
           gp.add(ta,1,2);
           gp.setHgap(10);
           gp.setVgap(20);
           Scene sce=new Scene(gp,570,340);
           tf.setOnAction(e->{
              try
              {
                 String orderNum=tf.getText();
                 String fileNum=orderNum+".txt";
                 File file=new File(fileNum);
                 if(!file.exists())
                 {
                     System.out.println("SORRY WRONG ORDER NUMBER ");
                     throw new FileNotFoundException(" SORRY ORDER NUMBER DOES NOT EXIST !");
                 }
                 FileReader fw=new FileReader(file.getAbsoluteFile());
                 BufferedReader br=new BufferedReader(fw);
                 String Orecipe="";
                while((Orecipe=br.readLine())!=null)
                {
                    ta.appendText(Orecipe+"\n");
                    
                }
              }
              catch(IOException ie)
              {
                  Alert alert=new Alert(AlertType.ERROR);
                  alert.setTitle("ERROR");
                  alert.setContentText("SORRY ORDER NUMBER DOES NOT EXIST");
                  alert.showAndWait();
              }
           });
           st.setScene(sce);
           st.show();
       }
       @FXML
       public void appearOnScreen()
       {
           Image img=new Image("pizzaImages\\pizzabase.png");
           ImageView imview=new ImageView(img);
           imview.setFitHeight(200);
           imview.setFitWidth(200);
           sPane.getChildren().add(imview);
           String recip="";
           String size="";
           String cru="";
           String topp="";
            recip="                               PIZZA BUILDER";
           recip+="\n                           10036,MANHATTAN,NY             ";
           recip+="\n************************************************\n";
           String drinksName="";
           String slidesName="";
           String comboNames="";
          
           if(pizza.isEmpty())
           {
           
           if(small.isSelected())
           {
               size="Small pizza";
           }
           if(medium.isSelected())
           {
               size="Medium Pizza";
           }
           if(large.isSelected())
           {
               size="Large Pizza";
           }
           if(xLarge.isSelected())
           {
               size="X-Large Pizza";
           }
           if(thinCrust.isSelected())
           {
               cru="**Thin crust";
           }
           if(handMade.isSelected())
           {
               cru="**Hand Made";
           }
           if(stuffCrust.isSelected())
           {
               
               cru="**Stuffed Crust";
           }
           if(pepperoni.isSelected())
           {
               topp+="\n>Pepperoni:";
                Image img1=new Image("pizzaImages\\pep.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
             
               
           }
           if(ham.isSelected())
           {
               topp+="\n>Ham:";
                Image img1=new Image("pizzaImages\\Ham.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);
           }
           if(sausage.isSelected())
           {
               topp+="\n>Sausage:";
                 Image img1=new Image("pizzaImages\\bacon.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);
             
           }
           if(beef.isSelected())
           {
               topp+="\n>Beef:";
                 Image img1=new Image("pizzaImages\\beef.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);

           }
           if(bacon.isSelected())
           {
               topp+="\n>Bacon:";
                 Image img1=new Image("pizzaImages\\bacon.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);
             
           }
           if(greenOlives.isSelected())
           {
               topp+="\n>Green Olives:";
                 Image img1=new Image("pizzaImages\\gOlives.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);
               
           }
           if(greenPepper.isSelected())
           {
               topp+="\n>Green Pepper:";
                 Image img1=new Image("pizzaImages\\gPepper.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);
              
           }
           if(tomatoes.isSelected())
           {
               topp+="\n>Tomatoes:";
                 Image img1=new Image("pizzaImages\\Tom.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);
              
           }
           if(onion.isSelected())
           {
            topp+="\n>Onions:";   
            
           }
           if(mushroom.isSelected())
           {
               topp+="\n>Mushroom:";
                 Image img1=new Image("pizzaImages\\mushrooms.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
                 sPane.getChildren().add(imview1);
               
           }
           if(drinks.isEmpty()==false)
           {
              drinksName+=drinks.get(0).toString();
           }
           
        if(slides.isEmpty()==false)
             {
                slidesName+=slides.get(0).toString();
             }
        if(combos.isEmpty()==false)
        {
            comboNames+="\n"+combos.get(0).toString();
        }
        
           recip+="\n"+size+"\n";
           recip+=cru;
           recip+=topp;
           recip+=slidesName;
           recip+=drinksName;
           recip+=comboNames;
           
          
           Treceipt.setText(recip);
          
           }
           else
           {
               for(int i=0;i<pizza.size();i++)
               {
                   recip+=pizza.get(i).toString();
               }
               if(small.isSelected())
           {
               size="Small pizza";
           }
           if(medium.isSelected())
           {
               size="Medium Pizza";
           }
           if(large.isSelected())
           {
               size="Large Pizza";
           }
           if(xLarge.isSelected())
           {
               size="X-Large Pizza";
           }
           if(thinCrust.isSelected())
           {
               cru="**Thin crust";
           }
           if(handMade.isSelected())
           {
               cru="**Hand Made";
           }
           if(stuffCrust.isSelected())
           {
               
               cru="**Stuffed Crust";
           }
           if(pepperoni.isSelected())
           {
               topp+="\n>Pepperoni:";
                Image img1=new Image("pizzaImages\\pep.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
             
               
           }
           if(ham.isSelected())
           {
               topp+="\n>Ham:";
               Image img1=new Image("pizzaImages\\Ham.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
               
           }
           if(sausage.isSelected())
           {
               topp+="\n>Sausage:";
                 Image img1=new Image("pizzaImages\\bacon.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
             
           }
           if(beef.isSelected())
           {
               topp+="\n>Beef:";
                Image img1=new Image("pizzaImages\\beef.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);

           }
           if(bacon.isSelected())
           {
               topp+="\n>Bacon:";
                Image img1=new Image("pizzaImages\\bacon.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
             
           }
           if(greenOlives.isSelected())
           {
               topp+="\n>Green Olives:";
                Image img1=new Image("pizzaImages\\gOlives.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
               
           }
           if(greenPepper.isSelected())
           {
               topp+="\n>Green Pepper:";
                Image img1=new Image("pizzaImages\\gPepper.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
              
           }
           if(tomatoes.isSelected())
           {
               topp+="\n>Tomatoes:";
                Image img1=new Image("pizzaImages\\Tom.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
              
           }
           if(onion.isSelected())
           {
            topp+="\n>Onions:";  
             
           
           }
           if(mushroom.isSelected())
           {
               topp+="\n>Mushroom:";
                 Image img1=new Image("pizzaImages\\mushrooms.png");
           ImageView imview1=new ImageView(img1);
           imview1.setFitHeight(200);
           imview1.setFitWidth(200);
           sPane.getChildren().add(imview1);
               
           }
             if(drinks.isEmpty()==false)
           {
              drinksName+=drinks.get(0).toString();
           }
             if(slides.isEmpty()==false)
             {
                slidesName+=slides.get(0).toString();
             }
              if(combos.isEmpty()==false)
        {
            comboNames+="\n"+combos.get(0).toString();
        }
           recip+="\n"+size+"\n";
           recip+=cru;
           recip+=topp;
           recip+=drinksName;
           recip+=slidesName;
           recip+=comboNames;
           Treceipt.setText(recip);
               
               
           }
          
       }
       @FXML
       public void removePizza()
       {
           Stage st=new Stage();
           Label ord=new Label("WHICH PIZZA YOU WANT TO REMOVE  ");
           TextField tf=new TextField();
           GridPane gp=new GridPane();
           gp.setPadding(new Insets(10,10,10,20));
           gp.add(ord, 0, 0);
           gp.add(tf, 1, 0);
           gp.setHgap(10);
           gp.setVgap(20);
           tf.setOnAction(e->{
              try
              {
                  int pizzaNo=Integer.parseInt(tf.getText());
                  pizza.remove(pizzaNo-1);
                  appearOnScreen();
                  st.hide();
              }
              catch(Exception ef)
              {
                  Alert alert=new Alert(AlertType.ERROR);
                  alert.setTitle("ERROR");
                  alert.setContentText("SORRY PIZZA DOES NOT EXIST IN CART !");
                  alert.showAndWait();
              }
           });
           
           Scene sce=new Scene(gp,470,180);
           st.setScene(sce);
           st.show();
       }
       @FXML
       public void addBev()
       {
           Label lb1=new Label("CHOOSE BEVERAGE");
           CheckBox cock=new CheckBox("COCA -COLA($1.00)");
           CheckBox dieCock=new CheckBox("DIET COKE($1.25)");
           CheckBox sprite=new CheckBox("SPRITE($1.25)");
           CheckBox pepsi=new CheckBox("PEPSI($1.75)");
           Label lb2=new Label("CHOOSE SLIDES");
           CheckBox breadS=new CheckBox("BREAD STICK($1.99)");
           CheckBox parm=new CheckBox("PARMESAN BITES($3.75)");
           CheckBox cinStx=new CheckBox("CINNA STIX($3.65)");
           Button ads=new Button("ADD");
           Pane pan=new Pane();
           lb1.setLayoutX(20);
           lb1.setLayoutY(10);
           lb2.setLayoutY(90);
           lb2.setLayoutX(20);
           FlowPane flow=new FlowPane();
           flow.getChildren().addAll(cock,dieCock,sprite,pepsi);
           flow.setHgap(10);
           flow.setVgap(10);
           flow.setPadding(new Insets(30,0,10,10));
             FlowPane fs=new FlowPane();
              fs.setHgap(10);
              fs.setVgap(10);
            fs.getChildren().addAll(breadS,parm,cinStx);
           fs.setLayoutY(120);
           fs.setLayoutX(15);
           ads.setLayoutX(20);
           ads.setLayoutY(190);
           pan.getChildren().addAll(flow,lb1,lb2,fs,ads);
           ads.setOnAction(e->{
               double bevAmount=0;
               String bev="";
               String slid="";
               double slidAmount=0;
              if(cock.isSelected())
              {
                  bev+="Coca-Cola:";
                  bevAmount+=1.00;
              }
               if(dieCock.isSelected())
              {
                  bev+="Diet Coke:";
                  bevAmount+=1.25;
              }
                if(sprite.isSelected())
              {
                  bev+="Sprite:";
                  bevAmount+=1.25;
              }
                 if(pepsi.isSelected())
              {
                  bev+="Pepsi:";
                  bevAmount+=1.75;
              }
                  if(breadS.isSelected())
              {
                  slid+="Bread Stick:";
                  slidAmount+=1.99;
              }
                   if(parm.isSelected())
              {
                 slid+="Parmesan Bites:";
                  slidAmount+=3.75;
              }
                    if(cinStx.isSelected())
              {
                 slid+="Cinna Stix:";
                  slidAmount+=3.65;
              }
                 
                 Drink dbs=new Drink(bev,bevAmount);
                 drinks.add(dbs);
                 Slides sld=new Slides(slid,slidAmount);
                 slides.add(sld);
                 appearOnScreen();
                 System.out.println(sld);
                 
                 System.out.println(dbs);
                  
           });
       
           
           Scene scene=new Scene(pan,450,300);
           Stage stge=new Stage();
           stge.setScene(scene);
           stge.show();
       }
       @FXML
           public void addCombo()
           {
               
               Date date=new Date();
             Image img1=new Image("Images\\com1b.png");
             ImageView iv1=new ImageView(img1);
             iv1.setLayoutX(20);
             iv1.setFitWidth(220);
             iv1.setLayoutY(10);
             
             Image img2=new Image("Images\\com2b.png");
              ImageView iv2=new ImageView(img2);
              iv2.setFitWidth(220);
              iv2.setLayoutX(270);
              iv2.setLayoutY(3);
              Image img3=new Image("Images\\com3b.png");
             ImageView iv3=new ImageView(img3);
              iv3.setFitWidth(220);
              iv3.setLayoutX(560);
              iv3.setLayoutY(-23);
              
              Image img4=new Image("Images\\com4b.png");
             ImageView iv4=new ImageView(img4);
              iv4.setFitWidth(260);
              iv4.setFitHeight(260);
              iv4.setLayoutX(780);
              iv4.setLayoutY(10);
             
              Image img5=new Image("Images\\com5b.png");
              ImageView iv5=new ImageView(img5);
           iv5.setLayoutY(370);
           iv5.setFitHeight(220);
           iv5.setFitWidth(220);
           iv5.setLayoutX(120);
           Image img6=new Image("Images\\com7b.png");
              ImageView iv6=new ImageView(img6);
              iv6.setLayoutY(320);
              iv6.setLayoutX(420);
              iv6.setFitHeight(320);
              iv6.setFitWidth(280);
              
         
              
             
            
             Button btnCombo1=new Button("COMBO 1(MONDAY-SPECAL $7.00)");
             btnCombo1.setLayoutY(320);
             btnCombo1.setLayoutX(20);
             
             Button btnCombo2=new Button("COMBO 2(TUESDAY-SPECIAL $9.00)");
              btnCombo2.setLayoutY(320);
                btnCombo2.setLayoutX(290);
             
            
             Button btnCombo3=new Button("COMBO 3(WEDNESDAY-SPECIAL $6.50)");
              btnCombo3.setLayoutY(320);
                btnCombo3.setLayoutX(570);
             
             Button btnCombo4=new Button("COMBO 4(THURSDAY-SPECIAL $4.00)");
              btnCombo4.setLayoutY(320);
                btnCombo4.setLayoutX(840);
                  Button btnCombo5=new Button("COMBO 5(FRIDAY-SPECIAL $8.00)");
              btnCombo5.setLayoutY(620);
                btnCombo5.setLayoutX(140);
                  Button btnCombo6=new Button("COMBO 6(SATURDAY-SPECIAL $7.70)");
              btnCombo6.setLayoutY(620);
               btnCombo6.setLayoutX(440);
            double[] comboAmount={0};
            String[] comboName={""};
    
                 btnCombo1.setOnAction(e->
                 {
                     if(date.getDay()==1)
                     {
                        
                         comboAmount[0]=0.5*7;
                         comboName[0]="Combo 1 50% off";
                          addCombos(comboName,comboAmount);
                             
                     }
                     else
                     {
                    comboAmount[0]=7.00;
                      comboName[0]="Combo 1";
                      addCombos(comboName,comboAmount);
                     }
                     
                 });
                  btnCombo2.setOnAction(e->
                 {
                     if(date.getDay()==2)
                     {
                        
                         comboAmount[0]=0.5*9;
                           comboName[0]="Combo 2 50% off";
                            addCombos(comboName,comboAmount);
                           
                             
                     }
                     else
                     {
                    comboAmount[0]=9.00;
                    comboName[0]="Combo 2";
                    addCombos(comboName,comboAmount);
                     }
                     
                 });
                   btnCombo3.setOnAction(e->
                 {
                     if(date.getDay()==3)
                     {
                        
                         comboAmount[0]=0.5*6.50;
                           comboName[0]="Combo 3 50% off";
                            addCombos(comboName,comboAmount);
                             
                     }
                     else
                     {
                    comboAmount[0]=6.50;
                     comboName[0]="Combo 3";
                     addCombos(comboName,comboAmount);
                     }
                 });
                    btnCombo4.setOnAction(e->
                 {
                     if(date.getDay()==4)
                     {
                        
                         comboAmount[0]=0.5*4;
                           comboName[0]="Combo 4 50% off";
                            addCombos(comboName,comboAmount);
                             
                     }
                     else
                     {
                    comboAmount[0]=4.00;
                    comboName[0]="Combo 4";
                    addCombos(comboName,comboAmount);
                     }
                     
                 });
                     btnCombo5.setOnAction(e->
                 {
                     if(date.getDay()==5)
                     {
                        
                         comboAmount[0]=0.5*8;
                           comboName[0]="Combo 5 50% off";
                           addCombos(comboName,comboAmount);   
                     }
                     else
                     {
                    comboAmount[0]=8.00;
                    comboName[0]="Combo 5";
                    addCombos(comboName,comboAmount);
                     }
                     
                 });
                      btnCombo6.setOnAction(e->
                 {
                     if(date.getDay()==6)
                     {
                        
                         comboAmount[0]=0.5*7.70;
                           comboName[0]="Combo 6 50% off";
                            addCombos(comboName,comboAmount);
                             
                     }
                     else
                     {
                    comboAmount[0]=7.70;
                    comboName[0]="Combo 6";
                    addCombos(comboName,comboAmount);
                     }
                     
                 });
                     
            
           
              
             
            Pane img=new Pane();
              img.getChildren().addAll(iv1,iv2,iv3,iv4,btnCombo1,btnCombo2,btnCombo3,btnCombo4,iv5,iv6,btnCombo5,btnCombo6);
       
             Pane root=new Pane();
             root.getChildren().addAll(img);
           
           
             Scene scene=new Scene(root,1100,700);
              Stage stg=new Stage();
             stg.setScene(scene);
             stg.setTitle("DAILY SPECIAL ");
             stg.show();
             
           }
           public void addCombos(String[] comboName,double[] comboAmount)
            {
             
                String comboNames=comboName[0];
                double comboAmounts=comboAmount[0];
                
              Combo com=new Combo(comboNames,comboAmounts);
              combos.add(com);
              appearOnScreen();
            }
              
   
     
}
