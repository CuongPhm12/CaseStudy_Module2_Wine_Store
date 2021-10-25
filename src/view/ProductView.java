package view;

import controller.ProductManagement;
import model.product.Product;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static Scanner scanner = new Scanner(System.in);
    public static ProductManagement productManagement = new ProductManagement();
static{
    productManagement.add(new Product("rv01","Les Gallet Dolt","Vang Pháp, vang đỏ, nho Malbec",800));
    productManagement.add(new Product("rv02","La Tourne","Vang Pháp, vang đỏ, nho Syrah",432));
    productManagement.add(new Product("rv03","Santi Amarone","Vang Ý, vang đỏ, nho Corvina", 2100));
    productManagement.add(new Product("rv04","Alteo","Vang Ý, vang đỏ,nho Rondinella",3300));
    productManagement.add(new Product("rv05","Petralluce","Vang Ý, vang trắng, nho Verdeca",806));
    productManagement.add(new Product("rv06","Casa Millaman","Vang Chile, vang đỏ, nhiều loại nho",800));

}
public void run() {
    String choice;
    do {
        menuProduct();
        choice = scanner.nextLine();
        switch (choice) {
            case "1": {
                addProduct();
                break;
            }
            case "2": {
                displayProduct();
                break;
            }
            case "3": {
                editProduct();
                break;
            }
            case "4": {
                deleteProduct();
                break;
            }
            case "5": {
                writeProductToFileCsv();
                break;
            }
            case "6": {
                readProductToFileCsv();
                break;
            }
            case "0": {

                break;
            }
            default: {
                System.out.println("Nhập sai, nhập lại đi nào");
            }
        }
    } while (!choice.equals("0"));
}

    private void readProductToFileCsv() {
        try {
            System.out.print("Nhập vào file cần đọc: ");
            String filePath = scanner.nextLine();
            File file = new File(filePath);

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.split(",")));
            }
            br.close();
        } catch (IOException ie) {
            System.err.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }

    private void writeProductToFileCsv() {
        List<Product> products = productManagement.getProductList();
        try {
            System.out.print("Bạn muốn ghi vào file nào: ");
            String filePath = scanner.nextLine();
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (Product product: products) {
                bw.write(String.valueOf(product));
                bw.newLine();
            }
            System.out.println("Ghi file thành công");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct() {
        System.out.println("Xóa một sản phẩm");
        System.out.print("Nhập mã sản phẩm mà bạn muốn xóa: ");
        String productId = scanner.nextLine();
        int index = productManagement.findById(productId);
        if (index != -1) {
            productManagement.removeById(productId);
        } else {
            System.out.println("Không tìm thấy :((");
        }
    }

    private void editProduct() {
        System.out.println("Sửa thông tin sản phẩm");
        System.out.print("Nhập mã sản phẩm cần sửa: ");
        String productId = scanner.nextLine();
        int index = productManagement.findById(productId);
        if (index != -1) {
            Product product = inputProductNew();
            productManagement.edit(productId, product);
        } else {
            System.out.println("Không tìm thấy :((");
        }
    
    }

    private void displayProduct() {
        productManagement.showAll();
    }

    private void addProduct() {
        Product product = inputProductNew();
        if (!productManagement.getProductList().isEmpty()) {
            int index = productManagement.findById(product.getIdProduct());
            if (index != -1) {
                System.out.println("id này đã tồn tại mời nhập lại");
            } else {
                productManagement.add(product);
            }
        } else {
            productManagement.add(product);
        }
    }

    private Product inputProductNew() {
        System.out.println("Nhập thông tin sản phẩm");
        System.out.print("Nhập mã sản phẩm: ");
        String idProduct = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        String descriptionProduct = scanner.nextLine();
        System.out.print("Nhập giá bán: ");
        double priceProduct = scanner.nextDouble();
        return new Product(idProduct, nameProduct, descriptionProduct, priceProduct);
    }


    private void menuProduct() {
    System.out.println("--------Quản lý sản phẩm---------");
    System.out.println("1. Thêm sản phẩm mới");
    System.out.println("2. Hiển thị danh sách sản phẩm");
    System.out.println("3. Sửa thông tin sản phẩm");
    System.out.println("4. Xóa sản phẩm");
    System.out.println("5. Ghi sản phẩm vào file");
    System.out.println("6. Đọc từ file");
    System.out.println("0. Quay lại");
    System.out.print("Nhập lựa chọn của bạn: ");
}
}
