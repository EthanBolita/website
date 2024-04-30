package com.velm.website;

    public class product{
        //String productName;
        double productPrice;
        String selectedSize;
        String selectedColor;
        int quantity;
       public product( /**String productName,*/ double productPrice, String selectedSize,  String selectedColor, int quantity){
        // this.productName=productName;
         this.selectedColor=selectedColor;
         this.productPrice=productPrice;
         this.selectedSize=selectedSize;
         this.quantity=quantity;
       }
       
       
       public product(int i, String string, double d, String string2, String string3) {
        //TODO Auto-generated constructor stub
    }


    /** 
        * @return double
        */
       public double getPrice(){
         return productPrice;
       }
     
       public String getColor(){
         return selectedColor;
       }
     
     /**   public String getType(){
         return productName;
       }*/
       
       public int getquantity(){
        return quantity;
       }
     
       public String getSize(){
         return selectedSize;
       }
     
       public String toString(){
         String item="Style: "+/**  productName +*/" Color: "+selectedColor+" Size: "+selectedSize+" Price: "+productPrice+ " Quantity: "+quantity;
         return item;
       }
     
     }
    