package controller;

import model.product.Product;
import model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements General<Product> {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }


    @Override
    public void showAll() {
        if(productList.isEmpty()){
            System.out.println("Hiện tại không có sản phẩm nào");
        }
        for (Product product:productList
             ) {
            System.out.println(product);
        }

    }

    @Override
    public void add(Product product) {

    }

    @Override
    public void edit(String id, Product product) {

    }

    @Override
    public void removeById(String id) {

    }

    @Override
    public void findById(String id) {

    }

    @Override
    public void findByName(String name) {

    }
}
