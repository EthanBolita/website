package com.velm.website;

    public class product{
        String productName;
        double productPrice;
        String selectedSize;
        String selectedColor;
       public product( String productName, double productPrice, String selectedSize,  String selectedColor){
         this.productName=productName;
         this.selectedColor=selectedColor;
         this.productPrice=productPrice;
        this.selectedSize=selectedSize;
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
     
       public String getType(){
         return productName;
       }
    
     
       public String getSize(){
         return selectedSize;
       }
     
       public String toString(){
         String item="Style: "+ productName +" Color: "+selectedColor+" Size: "+selectedSize+" Price: "+productPrice;
         return item;
       }
     
     }
    