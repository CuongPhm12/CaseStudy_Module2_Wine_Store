package controller;

import model.product.Product;
import model.product.ProductSortByPriceDecrease;
import model.product.ProductSortByPriceIncrease;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá cho sản phẩm: ");
        long price = scanner.nextInt();
        System.out.print("Nhập số lượng cho sản phẩm: ");
        int quantity = scanner.nextInt();
        System.out.print("Nhập mô tả cho sản phẩm: ");
        String description = scanner.nextLine();
        System.out.println("Nhập loại sản phẩm");
        String type = scanner.nextLine();

        products.add(product);

    }

    @Override
    public void edit(String id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.get(i).setId(product.getId());
                products.get(i).setName(product.getName());
                products.get(i).setType(product.getType());
                products.get(i).setType(product.getType());
                products.get(i).setPrice(product.getPrice());
                products.get(i).setQuantity(product.getQuantity());
                products.get(i).setDescription(product.getDescription());

            }
        }
    }

    @Override
    public void remove(int index) {
        products.remove(index);
    }

    public void displayAllProducts() {
        for (Product product : products
        ) {
            System.out.println(product);
        }
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
        System.out.println(" Sắp xếp sản phẩm tăng dần theo giá ");
        for (Product product : products) {
            System.out.println(product);
    }
    public void sortPriceDecrease(){
        ProductSortByPriceDecrease priceDecrease = new ProductSortByPriceDecrease();
        products.sort(priceDecrease);
            System.out.println(" Sắp xếp sản phẩm giảm dần theo giá ");
            for (Product product : products) {
                System.out.println(product);
    }

}
