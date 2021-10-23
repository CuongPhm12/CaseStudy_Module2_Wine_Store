package model.product;

import model.Category;


public class Wine extends Product{

    public Wine() {
    }

    public Wine(String idProduct, String nameProduct, String descriptionProduct, double priceProduct, int sold, int amount, Category category) {
        super(idProduct, nameProduct, descriptionProduct, priceProduct, sold, amount, category);
    }
}

