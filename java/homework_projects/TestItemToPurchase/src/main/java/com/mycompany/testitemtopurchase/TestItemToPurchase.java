/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testitemtopurchase;

/**
 *
 * @author binu
 */
public class TestItemToPurchase {

    public static void main(String[] args) {
        ItemToPurchase item1 = new ItemToPurchase();
        item1.setName("Bottled Water");
        item1.setPrice(10);
        item1.setQuantity(1);
        item1.setDescription("Bottled Water: Deer Park, 12 oz.");
    
        item1.printItemCost();
        item1.printItemDescription();
    }
}
