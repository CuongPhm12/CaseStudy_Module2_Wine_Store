package controller;

import model.product.Product;
import model.product.ProductSortByPriceDecrease;
import model.product.ProductSortByPriceIncrease;

import java.io.*;
import java.util.ArrayList;

public class ProductManagement implements General<Product> {
    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void edit(int index, Product product) {
        products.set(index,product);
    }

    @Override
    public void remove(int index) {
        products.remove(index);
    }

    @Override
    public void save() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PRODUCT_DATA);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(PRODUCT_DATA);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (ArrayList<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("No Data");
            products = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sortPriceIncrease(){
        ProductSortByPriceIncrease priceIncrease = new ProductSortByPriceIncrease();
        products.sort(priceIncrease);
    }
    public void sortPriceDecrease(){
        ProductSortByPriceDecrease priceDecrease = new ProductSortByPriceDecrease();
        products.sort(priceDecrease);
    }

}
