package controller;

import model.Category;

public interface General<T> {
    void showAll();
    void add(T t);
    void edit(String id, T t);
    void removeById(String id);
    int findById(String id);
}
