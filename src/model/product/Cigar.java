package model.product;

import model.Category;

public class Cigar extends Product{
    public Cigar() {
    }

    public Cigar(String idProduct, String nameProduct, String descriptionProduct, double priceProduct, int sold, int amount, Category category) {
        super(idProduct, nameProduct, descriptionProduct, priceProduct, sold, amount, category);
    }
}
