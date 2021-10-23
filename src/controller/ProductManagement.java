package controller;

import model.product.Wine;

import java.util.ArrayList;

public class ProductManagement implements General<Wine> {
    private ArrayList<Wine> productList = new ArrayList<>();

    public ArrayList<Wine> getProducts() {
        return productList;
    }

    public void setProducts(ArrayList<Wine> products) {
        this.productList = products;
    }

    @Override
    public void add(Wine product) {
        productList.add(product);
    }

    @Override
    public void edit(String id, Wine product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.get(i).setId(product.getId());
                productList.get(i).setName(product.getName());
                productList.get(i).setType(product.getType());
                productList.get(i).setType(product.getType());
                productList.get(i).setPrice(product.getPrice());
                productList.get(i).setQuantity(product.getQuantity());
                productList.get(i).setDescription(product.getDescription());
            }
        }
    }

    @Override
    public void remove(int index) {
        productList.remove(index);
    }

    @Override
    public void save() {

    }

    @Override
    public void read() {

    }

    public void displayAllProducts() {
        for (Wine product : productList
        ) {
            System.out.println(product);
        }
    }

//    @Override
//    public void save() {
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(PRODUCT_DATA);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(products);
//            objectOutputStream.close();
//            fileOutputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void read() {
//        try {
//            FileInputStream fileInputStream = new FileInputStream(PRODUCT_DATA);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            products = (ArrayList<Product>) objectInputStream.readObject();
//            objectInputStream.close();
//            fileInputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.err.println("No Data");
//            products = new ArrayList<>();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void sortPriceIncrease(){
//        ProductSortByPriceIncrease priceIncrease = new ProductSortByPriceIncrease();
//        products.sort(priceIncrease);
//        System.out.println(" Sắp xếp sản phẩm tăng dần theo giá ");
//        for (Product product : products) {
//            System.out.println(product);
//    }
//    public void sortPriceDecrease(){
//        ProductSortByPriceDecrease priceDecrease = new ProductSortByPriceDecrease();
//        products.sort(priceDecrease);
//            System.out.println(" Sắp xếp sản phẩm giảm dần theo giá ");
//            for (Product product : products) {
//                System.out.println(product);
//    }
//
}
