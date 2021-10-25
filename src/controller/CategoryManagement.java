package controller;

import model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManagement implements General<Category> {
    private final List<Category> categoryList= new ArrayList<>();

    public List<Category> getCategoryList() {
        return categoryList;
    }

    @Override
    public void showAll() {
        if (categoryList.isEmpty()) {
            System.out.println("Không có danh mục nào hết");
        }
        for (Category category : categoryList) {
            System.out.println(category);
        }

    }

    @Override
    public void add(Category category) {
        categoryList.add(category);
    }

    @Override
    public void edit(String id, Category category) {
        int index = findById(id);
        categoryList.set(index, category);
    }

    @Override
    public void removeById(String id) {
        int index = findById(id);
        categoryList.remove(index);
    }

    @Override
    public int findById(String id) {
        int index = -1;
        for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get(i).getIdCategory().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

}
