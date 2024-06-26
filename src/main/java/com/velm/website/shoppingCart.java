/**
 * This is the shoppingCart class, which creates a list to store products
 * and adds/removes them from the list.
 * @ authors: Ethan and Michael
 * @ date of oldest edition: April 25 
 * @ version: 2 
 */

package com.velm.website;

import java.util.ArrayList;

public class shoppingCart {
  private static shoppingCart instance = null;
  private ArrayList<product> products = new ArrayList<product>();
  private double totalCost = 0;
  

  // Private constructor to restrict instantiation
  shoppingCart() {}


  
  /** 
   * @return shoppingCart
   */
  // Method to get the singleton instance
    public static shoppingCart getInstance() {
        if (instance == null) {
            instance = new shoppingCart();
        }
        return instance;
    }
    /**
     * addToCartethod: it takes in a product and adds it to the object's
     * products arraylist, and increases the object's totalCost variable.
     */
  
    public void addToCart(product item){
      products.add(item);
      totalCost+=item.getPrice();
    }
  
    /**
     * remove method: it takes in a product and removes it from the object's
     * products arraylist, and decreases the totalCost variable.
     */
  
     public void remove(product item){
      int index = products.indexOf(item);
      if(index != -1){
        totalCost -= products.get(index).getPrice();
        products.remove(index);
        totalCost = (double) Math.round(totalCost * 100) / 100;
      }
    }
    
  
    
    /** 
     * @return double
     */
    public double getTotal(){
      return totalCost;
    }
  
    
    
    /** 
     * @return String
     */
    // * printContent method: it returns all the variables of the all
     //* the products stored in the arraylist.

  
    public String printContent(){
      String value="";
      for(int i=0; i<products.size();i++){
        value+=products.get(i).toString();
        if(i!=products.size()-1){
          value+="\n";
        }
      }
      return value;
    }
    
      
    public static void main(String[] args) {
      shoppingCart temp=new shoppingCart();
      product item=new product(19.99,"small", "red", 1);
      product item2=new product(24.99,"small", "black", 1);
      temp.addToCart(item);
      temp.addToCart(item2);
      System.out.println(temp.getTotal());
      //System.out.println(temp.printContent());
      temp.remove(item);
      System.out.println(temp.getTotal());
    } 


    
}
