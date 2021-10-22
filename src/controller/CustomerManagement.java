package controller;

import model.person.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement implements General<Customer>{
    ArrayList<Customer> customerArrayList = new ArrayList<>();
    @Override
    public void add(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        String address = scanner.nextLine();

        customerArrayList.add(customer);
    }

    @Override
    public void edit(String id, Customer customer) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getId().equals(id)) {
                customerArrayList.get(i).setId(customer.getId());
                customerArrayList.get(i).setName(customer.getName());
                customerArrayList.get(i).setPhone(customer.getPhone());

            }
        }
    }


    @Override
    public void remove(int index) {
        customerArrayList.remove(index);

    }

    public void displayAllCustomers() {
        for (Customer customers : customerArrayList
        ) {
            System.out.println(customers);
        }
    }


    @Override
    public void save() {

    }

    @Override
    public void read() {

    }
}
