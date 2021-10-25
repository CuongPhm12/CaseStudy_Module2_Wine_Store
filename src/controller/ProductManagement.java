package controller;

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
        productList.add(product);

    }

    @Override
    public void edit(String id, Product product) {
        int index = findById(id);
        productList.set(index, product);

    }

    @Override
    public void removeById(String id) {
        int index = findById(id);
        productList.remove(index);


    }

    @Override
    public int findById(String id) {
        int index = -1;
        for (int i = 0; i <productList.size() ; i++) {
            if(productList.get(i).getIdProduct().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public int findByName(String nameProduct) {
        int index = -1;
        for (int i = 0; i <productList.size() ; i++) {
            if(productList.get(i).getNameProduct().equals(nameProduct)){
                index = i;
                break;
            }
        }
        return index;
    }
}
