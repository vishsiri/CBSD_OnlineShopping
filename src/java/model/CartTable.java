/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author svish
 */
public class CartTable {
    public static void insertCart(List<ProductsWithQuantity> products) {
        int lastCartId = getLastCartId()+1 ;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("osc_cbsd_project_reportPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            for(int i = 0; i < products.size(); i++) {
                Shoppingcart cart = new Shoppingcart(lastCartId, products.get(i).getId(), products.get(i).getQuantity());
                em.persist(cart);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    private static int getLastCartId() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("osc_cbsd_project_reportPU");
        EntityManager em = emf.createEntityManager();
        List<Shoppingcart> cartList = (List<Shoppingcart>) em.createNamedQuery("Shoppingcart.findAll").getResultList();
        int maxId = 0;
        for(int i = cartList.size()-1 ; i >= 0; i--) {
            if(cartList.get(i).getShoppingcartPK().getCartId() > maxId){
                maxId = cartList.get(i).getShoppingcartPK().getCartId();
            }
        }
        em.close();
        return maxId;
    }
}