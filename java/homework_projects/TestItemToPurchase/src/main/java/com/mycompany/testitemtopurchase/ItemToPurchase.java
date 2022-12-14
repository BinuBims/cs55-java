/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testitemtopurchase;

/**
 *
 * @author binu
 */
public class ItemToPurchase extends Object {
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;
 
    public ItemToPurchase()
    {
        this.itemName = "none";
        this.itemDescription = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }
 
    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
     
    public String getName()
    {
        return itemName;
    }
 
    public void setName(String itemName)
    {
        this.itemName = itemName;
    }
 
    public int getPrice()
    {
        return itemPrice;
    }
 
    public void setPrice(int itemPrice)
    {
        this.itemPrice = itemPrice;
    }
 
    public int getQuantity()
    {
        return itemQuantity;
    }
 
    public void setQuantity(int itemQuantity)
    {
        this.itemQuantity = itemQuantity;
    }
 
    public String getDescription()
    {
        return itemDescription;
    }
 
    public void setDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }
     
    public void printItemCost()
    {
        int quantityCost = (getPrice() * getQuantity());
         
        System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = $" + quantityCost);
    }
     
    public void printItemDescription()
    {
        System.out.println(getName() + ": " + getDescription());
    }  
}
