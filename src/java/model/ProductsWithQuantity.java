/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author svish
 */
public class ProductsWithQuantity extends Products {
    private int quantity;
    private int productTotalPrice;
    
    public ProductsWithQuantity(Products product, int quantity, int productTotalPrice) {
        super(product.getId(), product.getMovie(), product.getRating(), product.getYearcreate(), product.getPrice());
        this.quantity = quantity;
        this.productTotalPrice = productTotalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(int productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }
     
    
    
}