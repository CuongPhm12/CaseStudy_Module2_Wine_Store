package controller;

import model.Cart;
import model.product.Wine;

import java.util.ArrayList;
import java.util.List;

public class CartManagement implements General<Cart>{
    private final List<Cart> cartList = new ArrayList<>();

    public List<Cart> getCartList() {
        return cartList;
    }

    @Override
    public void showAll() {
        if(cartList.isEmpty()) {
            System.out.println("Giỏ hàng của bạn trống");
        }
        System.out.println("Giỏ hàng của bạn nè: ");
        for (Cart cart: cartList) {
            System.out.println(cart + " , số lượng: " + cart.getProduct().getAmount());
        }
    }


    @Override
    public void add(Cart cart) {
        cartList.add(cart);
    }

    @Override
    public void edit(String id, Cart cart) {

    }

    @Override
    public void removeById(String id) {
        int index = findById(id);
        cartList.remove(index);
    }

    @Override
    public int findById(String id) {
        int index = -1;
        for (int i = 0; i < cartList.size(); i++) {
            if (cartList.get(i).getProduct().getIdProduct().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }
}




