/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author svish
 */
public class Cashier {
    public static int calculatePriceAllProduct(List<ProductsWithQuantity> products) {
        int sumPrice = 0;
        
        for(int i = 0; i < products.size(); i++) {
            sumPrice += products.get(i).getProductTotalPrice();
        }
        
        return sumPrice;
    }
    
    public int calculatePricePerProduct(int quantity, int pricePerUnit) {
        return quantity * pricePerUnit;
    }
}