/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.HashMap;
import model.CartTable;
import model.Cashier;
import model.ProductsWithQuantity;
import model.ProductTable;
import model.Products;

/**
 *
 * @author svish
 */
public class CentreControl {
    private static HashMap<String, CentreControl> controllerList = new HashMap<String, CentreControl>();
    private List<ProductsWithQuantity> products;
    private int sumPrice;
    
    private CentreControl() {
        sumPrice = 0;
    }
    
    public static CentreControl getController(String sessionId){
        if(!controllerList.containsKey(sessionId)){
            controllerList.put(sessionId, new CentreControl());
        }
        
        return controllerList.get(sessionId);
    }
    
    public void getCartData(String[] movies, String[] quantitys){
        products = ProductTable.findProductsByNameAsList(movies, quantitys);
        sumPrice = calculateSumPrice(products);
    }
    
    public List<ProductsWithQuantity> getProducts(){
        return products;
    }
    
    public int getSumPrice() {
        return sumPrice;
    }
    
    private int calculateSumPrice(List<ProductsWithQuantity> products) {
        return Cashier.calculatePriceAllProduct(products);
    }
    
    public void saveCart() {
        CartTable.insertCart(products);
    }
    
    public static List<Products> getAllProducts() {
        return ProductTable.findAllProducts();
    }
    
}
